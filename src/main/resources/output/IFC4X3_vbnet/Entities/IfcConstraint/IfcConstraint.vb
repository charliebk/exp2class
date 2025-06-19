Public Class IfcConstraint
    Public Name As IfcLabel
    Public Description As IfcText
    Public ConstraintGrade As IfcConstraintEnum
    Public ConstraintSource As IfcLabel
    Public CreatingActor As IfcActorSelect
    Public CreationTime As IfcDateTime
    Public UserDefinedGrade As IfcLabel

    ' === EXTENDED BY ===
    ' IfcMetric
    ' IfcObjective

    ' === INVERSE CLAUSES ===
    ' HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    ' PropertiesForConstraint : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatingConstraint

    ' === WHERE CLAUSES ===
    ' WR11 : (ConstraintGrade <> IfcConstraintEnum.USERDEFINED) OR ((ConstraintGrade = IfcConstraintEnum.USERDEFINED) AND EXISTS(SELF\IfcConstraint.UserDefinedGrade))
End Class
