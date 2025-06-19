public class IfcTrapeziumProfileDef : IfcParameterizedProfileDef
{
    public IfcPositiveLengthMeasure BottomXDim { get; set; }
    public IfcPositiveLengthMeasure TopXDim { get; set; }
    public IfcPositiveLengthMeasure YDim { get; set; }
    public IfcLengthMeasure TopXOffset { get; set; }
}
