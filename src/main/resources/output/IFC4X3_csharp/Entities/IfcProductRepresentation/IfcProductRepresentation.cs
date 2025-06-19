public class IfcProductRepresentation
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public List<IfcRepresentation> Representations { get; set; }

    // === EXTENDED BY ===
    // IfcMaterialDefinitionRepresentation
    // IfcProductDefinitionShape
}
