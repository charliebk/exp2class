Public Class IfcMaterialProfile Inherits IfcMaterialDefinition
    Public Name As IfcLabel
    Public Description As IfcText
    Public Material As IfcMaterial
    Public Profile As IfcProfileDef
    Public Priority As IfcInteger
    Public Category As IfcLabel

    ' === EXTENDED BY ===
    ' IfcMaterialProfileWithOffsets

    ' === INVERSE CLAUSES ===
    ' ToMaterialProfileSet : IfcMaterialProfileSet FOR MaterialProfiles

    ' === WHERE CLAUSES ===
    ' NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
End Class
