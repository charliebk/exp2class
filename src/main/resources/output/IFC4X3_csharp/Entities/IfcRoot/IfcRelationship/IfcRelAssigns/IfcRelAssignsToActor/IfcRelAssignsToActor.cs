public class IfcRelAssignsToActor : IfcRelAssigns
{
    public IfcActor RelatingActor { get; set; }
    public IfcActorRole ActingRole { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingActor :=: Temp)) = 0
}
