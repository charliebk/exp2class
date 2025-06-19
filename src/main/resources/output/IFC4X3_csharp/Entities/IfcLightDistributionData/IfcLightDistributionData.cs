public class IfcLightDistributionData
{
    public IfcPlaneAngleMeasure MainPlaneAngle { get; set; }
    public List<IfcPlaneAngleMeasure> SecondaryPlaneAngle { get; set; }
    public List<IfcLuminousIntensityDistributionMeasure> LuminousIntensity { get; set; }
}
