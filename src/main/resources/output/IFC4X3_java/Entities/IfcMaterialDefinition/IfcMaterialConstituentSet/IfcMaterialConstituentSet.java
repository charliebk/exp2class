public class IfcMaterialConstituentSet extends IfcMaterialDefinition {
    public IfcLabel Name;
    public IfcText Description;
    public SET [1:?] OF IfcMaterialConstituent MaterialConstituents;
}
