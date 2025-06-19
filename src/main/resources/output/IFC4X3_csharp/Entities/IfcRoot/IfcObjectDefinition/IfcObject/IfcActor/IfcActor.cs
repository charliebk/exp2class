public class IfcActor : IfcObject
{
    public IfcActorSelect TheActor { get; set; }

    // === EXTENDED BY ===
    // IfcOccupant

    // === INVERSE CLAUSES ===
    // IsActingUpon : SET [0:?] OF IfcRelAssignsToActor FOR RelatingActor
}
