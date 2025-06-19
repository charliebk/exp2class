public class IfcRelAggregates extends IfcRelDecomposes {
    public IfcObjectDefinition RelatingObject;
    public SET [1:?] OF IfcObjectDefinition RelatedObjects;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
}
