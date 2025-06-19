public class IfcPcurve : IfcCurve
{
    public IfcSurface BasisSurface { get; set; }
    public IfcCurve ReferenceCurve { get; set; }

    // === WHERE CLAUSES ===
    // DimIs2D : ReferenceCurve.Dim = 2
}
