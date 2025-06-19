public class IfcRelAssignsToGroup : IfcRelAssigns
{
    public IfcGroup RelatingGroup { get; set; }

    // === EXTENDED BY ===
    // IfcRelAssignsToGroupByFactor

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingGroup :=: Temp)) = 0
}
