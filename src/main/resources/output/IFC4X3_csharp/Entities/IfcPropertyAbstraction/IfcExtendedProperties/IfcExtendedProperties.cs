public class IfcExtendedProperties : IfcPropertyAbstraction
{
    public IfcIdentifier Name { get; set; }
    public IfcText Description { get; set; }
    public SET [1:?] OF IfcProperty Properties { get; set; }

    // === EXTENDED BY ===
    // IfcMaterialProperties
    // IfcProfileProperties
}
