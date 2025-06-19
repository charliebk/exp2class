Public Class IfcProfileDef
    Public ProfileType As IfcProfileTypeEnum
    Public ProfileName As IfcLabel

    ' === EXTENDED BY ===
    ' IfcArbitraryClosedProfileDef
    ' IfcArbitraryOpenProfileDef
    ' IfcCompositeProfileDef
    ' IfcDerivedProfileDef
    ' IfcOpenCrossProfileDef
    ' IfcParameterizedProfileDef

    ' === INVERSE CLAUSES ===
    ' HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    ' HasProperties : SET [0:?] OF IfcProfileProperties FOR ProfileDefinition
End Class
