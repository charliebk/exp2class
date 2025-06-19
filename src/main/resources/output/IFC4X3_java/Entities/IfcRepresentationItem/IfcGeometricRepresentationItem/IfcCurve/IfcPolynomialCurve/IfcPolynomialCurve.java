public class IfcPolynomialCurve extends IfcCurve {
    public IfcPlacement Position;
    public List<IfcReal> CoefficientsX;
    public List<IfcReal> CoefficientsY;
    public List<IfcReal> CoefficientsZ;

    // === WHERE CLAUSES ===
    // CorrectPositionDim : ((Position.Dim=2) AND (NOT EXISTS(CoefficientsZ))) OR (Position.Dim=3)
    // ValidCoefficients : (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ))
}
