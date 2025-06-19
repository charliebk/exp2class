public class IfcThirdOrderPolynomialSpiral : IfcSpiral
{
    public IfcLengthMeasure CubicTerm { get; set; }
    public IfcLengthMeasure QuadraticTerm { get; set; }
    public IfcLengthMeasure LinearTerm { get; set; }
    public IfcLengthMeasure ConstantTerm { get; set; }
}
