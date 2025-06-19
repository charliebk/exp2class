public class IfcOffsetCurve2D : IfcOffsetCurve
{
    public IfcLengthMeasure Distance { get; set; }
    public IfcLogical SelfIntersect { get; set; }

    // === WHERE CLAUSES ===
    // DimIs2D : BasisCurve.Dim = 2
}
