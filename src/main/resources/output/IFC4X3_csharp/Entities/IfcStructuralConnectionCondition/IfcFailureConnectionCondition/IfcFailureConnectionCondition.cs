public class IfcFailureConnectionCondition : IfcStructuralConnectionCondition
{
    public IfcForceMeasure TensionFailureX { get; set; }
    public IfcForceMeasure TensionFailureY { get; set; }
    public IfcForceMeasure TensionFailureZ { get; set; }
    public IfcForceMeasure CompressionFailureX { get; set; }
    public IfcForceMeasure CompressionFailureY { get; set; }
    public IfcForceMeasure CompressionFailureZ { get; set; }
}
