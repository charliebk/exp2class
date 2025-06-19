public class IfcRelAggregates : IfcRelDecomposes
{
    public IfcObjectDefinition RelatingObject { get; set; }
    public SET [1:?] OF IfcObjectDefinition RelatedObjects { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
}
