public class IfcRegularTimeSeries : IfcTimeSeries
{
    public IfcTimeMeasure TimeStep { get; set; }
    public List<IfcTimeSeriesValue> Values { get; set; }
}
