public class IfcOffsetCurve3D : IfcOffsetCurve
{
    public IfcLengthMeasure Distance { get; set; }
    public IfcLogical SelfIntersect { get; set; }
    public IfcDirection RefDirection { get; set; }

    // === WHERE CLAUSES ===
    // DimIs2D : BasisCurve.Dim = 3
}
