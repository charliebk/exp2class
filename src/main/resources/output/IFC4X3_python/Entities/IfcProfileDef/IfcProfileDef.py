class IfcProfileDef:
    def __init__(self):
        self.ProfileType: IfcProfileTypeEnum = None
        self.ProfileName: IfcLabel = None

    # === EXTENDED BY ===
    # IfcArbitraryClosedProfileDef
    # IfcArbitraryOpenProfileDef
    # IfcCompositeProfileDef
    # IfcDerivedProfileDef
    # IfcOpenCrossProfileDef
    # IfcParameterizedProfileDef

    # === INVERSE CLAUSES ===
    # HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    # HasProperties : SET [0:?] OF IfcProfileProperties FOR ProfileDefinition
