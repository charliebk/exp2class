public class IfcMaterialProfileSet : IfcMaterialDefinition
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public List<IfcMaterialProfile> MaterialProfiles { get; set; }
    public IfcCompositeProfileDef CompositeProfile { get; set; }
}
