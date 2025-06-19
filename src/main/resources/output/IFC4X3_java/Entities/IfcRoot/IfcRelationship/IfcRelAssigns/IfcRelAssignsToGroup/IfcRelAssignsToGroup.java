public class IfcRelAssignsToGroup extends IfcRelAssigns {
    public IfcGroup RelatingGroup;

    // === EXTENDED BY ===
    // IfcRelAssignsToGroupByFactor

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingGroup :=: Temp)) = 0
}
