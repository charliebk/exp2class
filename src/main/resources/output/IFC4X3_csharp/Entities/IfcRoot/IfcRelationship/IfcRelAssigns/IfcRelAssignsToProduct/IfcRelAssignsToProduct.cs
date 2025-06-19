public class IfcRelAssignsToProduct : IfcRelAssigns
{
    public IfcProductSelect RelatingProduct { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProduct :=: Temp)) = 0
}
