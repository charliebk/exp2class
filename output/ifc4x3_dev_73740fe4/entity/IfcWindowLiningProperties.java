package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWindowLiningProperties extends IfcPreDefinedPropertySet {

    public IfcPositiveLengthMeasure LiningDepth; // OPTIONAL
    public IfcNonNegativeLengthMeasure LiningThickness; // OPTIONAL
    public IfcNonNegativeLengthMeasure TransomThickness; // OPTIONAL
    public IfcNonNegativeLengthMeasure MullionThickness; // OPTIONAL
    public IfcNormalisedRatioMeasure FirstTransomOffset; // OPTIONAL
    public IfcNormalisedRatioMeasure SecondTransomOffset; // OPTIONAL
    public IfcNormalisedRatioMeasure FirstMullionOffset; // OPTIONAL
    public IfcNormalisedRatioMeasure SecondMullionOffset; // OPTIONAL
    public IfcShapeAspect ShapeAspectStyle; // OPTIONAL
    public IfcLengthMeasure LiningOffset; // OPTIONAL
    public IfcLengthMeasure LiningToPanelOffsetX; // OPTIONAL
    public IfcLengthMeasure LiningToPanelOffsetY; // OPTIONAL
    // INVERSE attributes:
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)));
    // WR32 : NOT(NOT(EXISTS(FirstTransomOffset)) AND EXISTS(SecondTransomOffset));
    // WR33 : NOT(NOT(EXISTS(FirstMullionOffset)) AND EXISTS(SecondMullionOffset));
    // WR34 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));

    // WHERE constraints:
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)));
    // WR32 : NOT(NOT(EXISTS(FirstTransomOffset)) AND EXISTS(SecondTransomOffset));
    // WR33 : NOT(NOT(EXISTS(FirstMullionOffset)) AND EXISTS(SecondMullionOffset));
    // WR34 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1]))
    // AND
    // ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]));
}
