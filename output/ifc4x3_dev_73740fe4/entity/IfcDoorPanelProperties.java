package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDoorPanelProperties extends IfcPreDefinedPropertySet {

    public IfcPositiveLengthMeasure PanelDepth; // OPTIONAL
    public IfcDoorPanelOperationEnum PanelOperation;
    public IfcNormalisedRatioMeasure PanelWidth; // OPTIONAL
    public IfcDoorPanelPositionEnum PanelPosition;
    public IfcShapeAspect ShapeAspectStyle; // OPTIONAL
    // INVERSE attributes:
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));

    // WHERE constraints:
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));
}
