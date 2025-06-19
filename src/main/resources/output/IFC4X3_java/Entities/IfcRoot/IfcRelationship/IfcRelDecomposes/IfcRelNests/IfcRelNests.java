public class IfcRelNests extends IfcRelDecomposes {
    public IfcObjectDefinition RelatingObject;
    public List<IfcObjectDefinition> RelatedObjects;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
}
