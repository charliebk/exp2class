public class IfcMaterialConstituentSet : IfcMaterialDefinition
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public SET [1:?] OF IfcMaterialConstituent MaterialConstituents { get; set; }
}
