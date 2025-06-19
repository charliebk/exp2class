public class IfcMaterialProfileSetUsageTapering : IfcMaterialProfileSetUsage
{
    public IfcMaterialProfileSet ForProfileEndSet { get; set; }
    public IfcCardinalPointReference CardinalEndPoint { get; set; }
}
