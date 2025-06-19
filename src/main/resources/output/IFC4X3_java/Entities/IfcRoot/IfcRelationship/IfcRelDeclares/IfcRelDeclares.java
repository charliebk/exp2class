public class IfcRelDeclares extends IfcRelationship {
    public IfcContext RelatingContext;
    public SET [1:?] OF IfcDefinitionSelect RelatedDefinitions;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedDefinitions | RelatingContext :=: Temp)) = 0
}
