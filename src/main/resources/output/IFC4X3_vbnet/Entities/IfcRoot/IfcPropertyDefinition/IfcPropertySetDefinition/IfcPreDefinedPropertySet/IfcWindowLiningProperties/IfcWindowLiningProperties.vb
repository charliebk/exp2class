Public Class IfcWindowLiningProperties Inherits IfcPreDefinedPropertySet
    Public LiningDepth As IfcPositiveLengthMeasure
    Public LiningThickness As IfcNonNegativeLengthMeasure
    Public TransomThickness As IfcNonNegativeLengthMeasure
    Public MullionThickness As IfcNonNegativeLengthMeasure
    Public FirstTransomOffset As IfcNormalisedRatioMeasure
    Public SecondTransomOffset As IfcNormalisedRatioMeasure
    Public FirstMullionOffset As IfcNormalisedRatioMeasure
    Public SecondMullionOffset As IfcNormalisedRatioMeasure
    Public ShapeAspectStyle As IfcShapeAspect
    Public LiningOffset As IfcLengthMeasure
    Public LiningToPanelOffsetX As IfcLengthMeasure
    Public LiningToPanelOffsetY As IfcLengthMeasure

    ' === WHERE CLAUSES ===
    ' WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    ' WR32 : NOT(NOT(EXISTS(FirstTransomOffset)) AND EXISTS(SecondTransomOffset))
    ' WR33 : NOT(NOT(EXISTS(FirstMullionOffset)) AND EXISTS(SecondMullionOffset))
    ' WR34 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
End Class
