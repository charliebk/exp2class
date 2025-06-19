public class IfcRelAssignsToControl extends IfcRelAssigns {
    public IfcControl RelatingControl;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingControl :=: Temp)) = 0
}
