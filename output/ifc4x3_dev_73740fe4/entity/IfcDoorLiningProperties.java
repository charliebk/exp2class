package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDoorLiningProperties extends IfcPreDefinedPropertySet {

    public IfcPositiveLengthMeasure LiningDepth; // OPTIONAL
    public IfcNonNegativeLengthMeasure LiningThickness; // OPTIONAL
    public IfcPositiveLengthMeasure ThresholdDepth; // OPTIONAL
    public IfcNonNegativeLengthMeasure ThresholdThickness; // OPTIONAL
    public IfcNonNegativeLengthMeasure TransomThickness; // OPTIONAL
    public IfcLengthMeasure TransomOffset; // OPTIONAL
    public IfcLengthMeasure LiningOffset; // OPTIONAL
    public IfcLengthMeasure ThresholdOffset; // OPTIONAL
    public IfcPositiveLengthMeasure CasingThickness; // OPTIONAL
    public IfcPositiveLengthMeasure CasingDepth; // OPTIONAL
    public IfcShapeAspect ShapeAspectStyle; // OPTIONAL
    public IfcLengthMeasure LiningToPanelOffsetX; // OPTIONAL
    public IfcLengthMeasure LiningToPanelOffsetY; // OPTIONAL
    // INVERSE attributes:
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)));
    // WR32 : NOT(EXISTS(ThresholdDepth) AND NOT(EXISTS(ThresholdThickness)));
    // WR33 : (EXISTS(TransomOffset) AND EXISTS(TransomThickness)) XOR
    // (NOT(EXISTS(TransomOffset)) AND NOT(EXISTS(TransomThickness)));
    // WR34 : (EXISTS(CasingDepth) AND EXISTS(CasingThickness)) XOR
    // (NOT(EXISTS(CasingDepth)) AND NOT(EXISTS(CasingThickness)));
    // WR35 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));

    // WHERE constraints:
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)));
    // WR32 : NOT(EXISTS(ThresholdDepth) AND NOT(EXISTS(ThresholdThickness)));
    // WR33 : (EXISTS(TransomOffset) AND EXISTS(TransomThickness)) XOR
    // (NOT(EXISTS(TransomOffset)) AND NOT(EXISTS(TransomThickness)));
    // WR34 : (EXISTS(CasingDepth) AND EXISTS(CasingThickness)) XOR
    // (NOT(EXISTS(CasingDepth)) AND NOT(EXISTS(CasingThickness)));
    // WR35 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));
}
