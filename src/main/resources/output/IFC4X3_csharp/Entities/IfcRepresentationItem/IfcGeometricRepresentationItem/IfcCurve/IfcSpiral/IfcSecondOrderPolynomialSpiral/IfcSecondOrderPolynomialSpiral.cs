public class IfcSecondOrderPolynomialSpiral : IfcSpiral
{
    public IfcLengthMeasure QuadraticTerm { get; set; }
    public IfcLengthMeasure LinearTerm { get; set; }
    public IfcLengthMeasure ConstantTerm { get; set; }
}
