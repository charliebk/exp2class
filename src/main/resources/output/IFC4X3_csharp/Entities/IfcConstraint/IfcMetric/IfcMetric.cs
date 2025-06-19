public class IfcMetric : IfcConstraint
{
    public IfcBenchmarkEnum Benchmark { get; set; }
    public IfcLabel ValueSource { get; set; }
    public IfcMetricValueSelect DataValue { get; set; }
    public IfcReference ReferencePath { get; set; }
}
