public class IfcExtendedProperties extends IfcPropertyAbstraction {
    public IfcIdentifier Name;
    public IfcText Description;
    public SET [1:?] OF IfcProperty Properties;

    // === EXTENDED BY ===
    // IfcMaterialProperties
    // IfcProfileProperties
}
