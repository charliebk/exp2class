public class IfcRelAssignsToActor extends IfcRelAssigns {
    public IfcActor RelatingActor;
    public IfcActorRole ActingRole;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingActor :=: Temp)) = 0
}
