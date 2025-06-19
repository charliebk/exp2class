public class IfcRelDeclares : IfcRelationship
{
    public IfcContext RelatingContext { get; set; }
    public SET [1:?] OF IfcDefinitionSelect RelatedDefinitions { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedDefinitions | RelatingContext :=: Temp)) = 0
}
