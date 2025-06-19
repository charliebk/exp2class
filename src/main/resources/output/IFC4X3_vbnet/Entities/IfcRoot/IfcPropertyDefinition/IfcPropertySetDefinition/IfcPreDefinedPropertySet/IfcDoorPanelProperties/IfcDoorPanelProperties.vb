Public Class IfcDoorPanelProperties Inherits IfcPreDefinedPropertySet
    Public PanelDepth As IfcPositiveLengthMeasure
    Public PanelOperation As IfcDoorPanelOperationEnum
    Public PanelWidth As IfcNormalisedRatioMeasure
    Public PanelPosition As IfcDoorPanelPositionEnum
    Public ShapeAspectStyle As IfcShapeAspect

    ' === WHERE CLAUSES ===
    ' ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
End Class
