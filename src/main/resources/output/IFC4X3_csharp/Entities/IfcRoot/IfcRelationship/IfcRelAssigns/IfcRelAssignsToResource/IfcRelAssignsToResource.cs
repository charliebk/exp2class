public class IfcRelAssignsToResource : IfcRelAssigns
{
    public IfcResourceSelect RelatingResource { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingResource :=: Temp)) = 0
}
