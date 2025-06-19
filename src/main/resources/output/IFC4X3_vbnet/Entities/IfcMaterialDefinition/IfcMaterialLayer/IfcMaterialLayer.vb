Public Class IfcMaterialLayer Inherits IfcMaterialDefinition
    Public Material As IfcMaterial
    Public LayerThickness As IfcNonNegativeLengthMeasure
    Public IsVentilated As IfcLogical
    Public Name As IfcLabel
    Public Description As IfcText
    Public Category As IfcLabel
    Public Priority As IfcInteger

    ' === EXTENDED BY ===
    ' IfcMaterialLayerWithOffsets

    ' === INVERSE CLAUSES ===
    ' ToMaterialLayerSet : IfcMaterialLayerSet FOR MaterialLayers

    ' === WHERE CLAUSES ===
    ' NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
End Class
