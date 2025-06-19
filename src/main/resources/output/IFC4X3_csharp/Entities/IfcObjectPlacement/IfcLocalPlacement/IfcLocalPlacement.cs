public class IfcLocalPlacement : IfcObjectPlacement
{
    public IfcAxis2Placement RelativePlacement { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : IfcCorrectLocalPlacement(RelativePlacement, PlacementRelTo)
}
