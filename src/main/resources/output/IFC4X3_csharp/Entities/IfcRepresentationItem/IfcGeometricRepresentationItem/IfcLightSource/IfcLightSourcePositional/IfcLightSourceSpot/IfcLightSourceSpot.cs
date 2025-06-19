public class IfcLightSourceSpot : IfcLightSourcePositional
{
    public IfcDirection Orientation { get; set; }
    public IfcReal ConcentrationExponent { get; set; }
    public IfcPositivePlaneAngleMeasure SpreadAngle { get; set; }
    public IfcPositivePlaneAngleMeasure BeamWidthAngle { get; set; }
}
