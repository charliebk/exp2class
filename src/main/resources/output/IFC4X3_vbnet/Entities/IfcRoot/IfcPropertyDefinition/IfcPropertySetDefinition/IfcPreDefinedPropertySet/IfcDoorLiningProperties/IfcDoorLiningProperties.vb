Public Class IfcDoorLiningProperties Inherits IfcPreDefinedPropertySet
    Public LiningDepth As IfcPositiveLengthMeasure
    Public LiningThickness As IfcNonNegativeLengthMeasure
    Public ThresholdDepth As IfcPositiveLengthMeasure
    Public ThresholdThickness As IfcNonNegativeLengthMeasure
    Public TransomThickness As IfcNonNegativeLengthMeasure
    Public TransomOffset As IfcLengthMeasure
    Public LiningOffset As IfcLengthMeasure
    Public ThresholdOffset As IfcLengthMeasure
    Public CasingThickness As IfcPositiveLengthMeasure
    Public CasingDepth As IfcPositiveLengthMeasure
    Public ShapeAspectStyle As IfcShapeAspect
    Public LiningToPanelOffsetX As IfcLengthMeasure
    Public LiningToPanelOffsetY As IfcLengthMeasure

    ' === WHERE CLAUSES ===
    ' WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    ' WR32 : NOT(EXISTS(ThresholdDepth) AND NOT(EXISTS(ThresholdThickness)))
    ' WR33 : (EXISTS(TransomOffset) AND EXISTS(TransomThickness)) XOR (NOT(EXISTS(TransomOffset)) AND NOT(EXISTS(TransomThickness)))
    ' WR34 : (EXISTS(CasingDepth) AND EXISTS(CasingThickness)) XOR (NOT(EXISTS(CasingDepth)) AND NOT(EXISTS(CasingThickness)))
    ' WR35 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
End Class
