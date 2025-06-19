public class IfcObjectPlacement
{
    public IfcObjectPlacement PlacementRelTo { get; set; }

    // === EXTENDED BY ===
    // IfcGridPlacement
    // IfcLinearPlacement
    // IfcLocalPlacement

    // === INVERSE CLAUSES ===
    // PlacesObject : SET [0:?] OF IfcProduct FOR ObjectPlacement
    // ReferencedByPlacements : SET [0:?] OF IfcObjectPlacement FOR PlacementRelTo
}
