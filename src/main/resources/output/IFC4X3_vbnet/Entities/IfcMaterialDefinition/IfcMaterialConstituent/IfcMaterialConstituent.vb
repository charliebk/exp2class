Public Class IfcMaterialConstituent Inherits IfcMaterialDefinition
    Public Name As IfcLabel
    Public Description As IfcText
    Public Material As IfcMaterial
    Public Fraction As IfcNormalisedRatioMeasure
    Public Category As IfcLabel

    ' === INVERSE CLAUSES ===
    ' ToMaterialConstituentSet : IfcMaterialConstituentSet FOR MaterialConstituents
End Class
