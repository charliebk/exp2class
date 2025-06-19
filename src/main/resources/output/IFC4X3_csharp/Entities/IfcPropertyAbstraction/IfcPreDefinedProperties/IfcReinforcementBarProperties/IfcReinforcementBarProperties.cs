public class IfcReinforcementBarProperties : IfcPreDefinedProperties
{
    public IfcAreaMeasure TotalCrossSectionArea { get; set; }
    public IfcLabel SteelGrade { get; set; }
    public IfcReinforcingBarSurfaceEnum BarSurface { get; set; }
    public IfcLengthMeasure EffectiveDepth { get; set; }
    public IfcPositiveLengthMeasure NominalBarDiameter { get; set; }
    public IfcCountMeasure BarCount { get; set; }
}
