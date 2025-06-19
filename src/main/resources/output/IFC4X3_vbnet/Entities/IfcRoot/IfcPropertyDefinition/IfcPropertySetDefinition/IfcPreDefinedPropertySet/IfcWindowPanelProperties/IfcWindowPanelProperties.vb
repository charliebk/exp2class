Public Class IfcWindowPanelProperties Inherits IfcPreDefinedPropertySet
    Public OperationType As IfcWindowPanelOperationEnum
    Public PanelPosition As IfcWindowPanelPositionEnum
    Public FrameDepth As IfcPositiveLengthMeasure
    Public FrameThickness As IfcPositiveLengthMeasure
    Public ShapeAspectStyle As IfcShapeAspect

    ' === WHERE CLAUSES ===
    ' ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
End Class
