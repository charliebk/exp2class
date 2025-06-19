public class IfcCurveStyleFontAndScaling : IfcPresentationItem
{
    public IfcLabel Name { get; set; }
    public IfcCurveStyleFontSelect CurveStyleFont { get; set; }
    public IfcPositiveRatioMeasure CurveFontScaling { get; set; }
}
