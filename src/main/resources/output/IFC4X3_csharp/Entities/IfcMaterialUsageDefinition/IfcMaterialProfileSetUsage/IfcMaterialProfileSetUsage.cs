public class IfcMaterialProfileSetUsage : IfcMaterialUsageDefinition
{
    public IfcMaterialProfileSet ForProfileSet { get; set; }
    public IfcCardinalPointReference CardinalPoint { get; set; }
    public IfcPositiveLengthMeasure ReferenceExtent { get; set; }

    // === EXTENDED BY ===
    // IfcMaterialProfileSetUsageTapering
}
