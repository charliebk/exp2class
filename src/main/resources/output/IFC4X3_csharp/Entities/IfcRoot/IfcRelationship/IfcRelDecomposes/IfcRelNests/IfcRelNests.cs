public class IfcRelNests : IfcRelDecomposes
{
    public IfcObjectDefinition RelatingObject { get; set; }
    public List<IfcObjectDefinition> RelatedObjects { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
}
