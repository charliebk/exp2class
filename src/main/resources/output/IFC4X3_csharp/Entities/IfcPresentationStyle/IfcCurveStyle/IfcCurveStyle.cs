public class IfcCurveStyle : IfcPresentationStyle
{
    public IfcCurveFontOrScaledCurveFontSelect CurveFont { get; set; }
    public IfcSizeSelect CurveWidth { get; set; }
    public IfcColour CurveColour { get; set; }
    public IfcBoolean ModelOrDraughting { get; set; }

    // === WHERE CLAUSES ===
    // IdentifiableCurveStyle : EXISTS(CurveFont) OR EXISTS(CurveWidth) OR EXISTS(CurveColour)
    // MeasureOfWidth : (NOT(EXISTS(CurveWidth))) OR ('IFC4X3_DEV_73740fe4.IFCPOSITIVELENGTHMEASURE' IN TYPEOF(CurveWidth)) OR (('IFC4X3_DEV_73740fe4.IFCDESCRIPTIVEMEASURE' IN TYPEOF(CurveWidth)) AND (CurveWidth = 'by layer'))
}
