package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWindowPanelProperties extends IfcPreDefinedPropertySet {

    public IfcWindowPanelOperationEnum OperationType;
    public IfcWindowPanelPositionEnum PanelPosition;
    public IfcPositiveLengthMeasure FrameDepth; // OPTIONAL
    public IfcPositiveLengthMeasure FrameThickness; // OPTIONAL
    public IfcShapeAspect ShapeAspectStyle; // OPTIONAL
    // INVERSE attributes:
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));

    // WHERE constraints:
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));
}
