Public Class IfcMaterialLayerSet Inherits IfcMaterialDefinition
    Public MaterialLayers As List(Of IfcMaterialLayer)
    Public LayerSetName As IfcLabel
    Public Description As IfcText

    ' === DERIVE CLAUSES ===
    ' TotalThickness : IfcLengthMeasure := IfcMlsTotalThickness(SELF)
End Class
