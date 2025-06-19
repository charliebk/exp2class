public class IfcRelDefinesByProperties extends IfcRelDefines {
    public SET [1:?] OF IfcObjectDefinition RelatedObjects;
    public IfcPropertySetDefinitionSelect RelatingPropertyDefinition;

    // === WHERE CLAUSES ===
    // NoRelatedTypeObject : SIZEOF(QUERY(Types <* SELF\IfcRelDefinesByProperties.RelatedObjects |  'IFC4X3_DEV_73740fe4.IFCTYPEOBJECT' IN TYPEOF(Types))) = 0
}
