public class IfcCurveStyle extends IfcPresentationStyle {
    public IfcCurveFontOrScaledCurveFontSelect CurveFont;
    public IfcSizeSelect CurveWidth;
    public IfcColour CurveColour;
    public IfcBoolean ModelOrDraughting;

    // === WHERE CLAUSES ===
    // IdentifiableCurveStyle : EXISTS(CurveFont) OR EXISTS(CurveWidth) OR EXISTS(CurveColour)
    // MeasureOfWidth : (NOT(EXISTS(CurveWidth))) OR ('IFC4X3_DEV_73740fe4.IFCPOSITIVELENGTHMEASURE' IN TYPEOF(CurveWidth)) OR (('IFC4X3_DEV_73740fe4.IFCDESCRIPTIVEMEASURE' IN TYPEOF(CurveWidth)) AND (CurveWidth = 'by layer'))
}
