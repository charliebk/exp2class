public class IfcPolynomialCurve : IfcCurve
{
    public IfcPlacement Position { get; set; }
    public List<IfcReal> CoefficientsX { get; set; }
    public List<IfcReal> CoefficientsY { get; set; }
    public List<IfcReal> CoefficientsZ { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPositionDim : ((Position.Dim=2) AND (NOT EXISTS(CoefficientsZ))) OR (Position.Dim=3)
    // ValidCoefficients : (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ))
}
