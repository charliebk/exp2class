public class IfcLightSourcePositional : IfcLightSource
{
    public IfcCartesianPoint Position { get; set; }
    public IfcPositiveLengthMeasure Radius { get; set; }
    public IfcReal ConstantAttenuation { get; set; }
    public IfcReal DistanceAttenuation { get; set; }
    public IfcReal QuadricAttenuation { get; set; }

    // === EXTENDED BY ===
    // IfcLightSourceSpot
}
