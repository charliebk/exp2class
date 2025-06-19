public class IfcRelAssignsToResource extends IfcRelAssigns {
    public IfcResourceSelect RelatingResource;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingResource :=: Temp)) = 0
}
