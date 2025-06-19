class IfcConstraint:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.ConstraintGrade: IfcConstraintEnum = None
        self.ConstraintSource: IfcLabel = None
        self.CreatingActor: IfcActorSelect = None
        self.CreationTime: IfcDateTime = None
        self.UserDefinedGrade: IfcLabel = None

    # === EXTENDED BY ===
    # IfcMetric
    # IfcObjective

    # === INVERSE CLAUSES ===
    # HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    # PropertiesForConstraint : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatingConstraint

    # === WHERE CLAUSES ===
    # WR11 : (ConstraintGrade <> IfcConstraintEnum.USERDEFINED) OR ((ConstraintGrade = IfcConstraintEnum.USERDEFINED) AND EXISTS(SELF\IfcConstraint.UserDefinedGrade))
