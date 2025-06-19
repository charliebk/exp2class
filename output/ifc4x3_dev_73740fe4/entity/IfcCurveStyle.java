package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCurveStyle extends IfcPresentationStyle {

    public IfcCurveFontOrScaledCurveFontSelect CurveFont; // OPTIONAL
    public IfcSizeSelect CurveWidth; // OPTIONAL
    public IfcColour CurveColour; // OPTIONAL
    public IfcBoolean ModelOrDraughting; // OPTIONAL
    // INVERSE attributes:
    // IdentifiableCurveStyle : EXISTS(CurveFont) OR EXISTS(CurveWidth) OR EXISTS(CurveColour);
    // MeasureOfWidth : (NOT(EXISTS(CurveWidth))) OR
    // ('IFC4X3_DEV_73740fe4.IFCPOSITIVELENGTHMEASURE' IN TYPEOF(CurveWidth)) OR
    // (('IFC4X3_DEV_73740fe4.IFCDESCRIPTIVEMEASURE' IN TYPEOF(CurveWidth)) AND
    // (CurveWidth = 'by layer'));

    // WHERE constraints:
    // IdentifiableCurveStyle : EXISTS(CurveFont) OR EXISTS(CurveWidth) OR EXISTS(CurveColour);
    // MeasureOfWidth : (NOT(EXISTS(CurveWidth))) OR
    // ('IFC4X3_DEV_73740fe4.IFCPOSITIVELENGTHMEASURE' IN TYPEOF(CurveWidth)) OR
    // (('IFC4X3_DEV_73740fe4.IFCDESCRIPTIVEMEASURE' IN TYPEOF(CurveWidth)) AND
    // (CurveWidth = 'by layer'));
}
