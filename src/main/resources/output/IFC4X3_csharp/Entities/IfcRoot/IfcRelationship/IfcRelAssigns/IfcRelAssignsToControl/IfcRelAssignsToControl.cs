public class IfcRelAssignsToControl : IfcRelAssigns
{
    public IfcControl RelatingControl { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingControl :=: Temp)) = 0
}
