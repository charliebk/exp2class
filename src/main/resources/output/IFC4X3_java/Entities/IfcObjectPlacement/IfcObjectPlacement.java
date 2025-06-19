public class IfcObjectPlacement {
    public IfcObjectPlacement PlacementRelTo;

    // === EXTENDED BY ===
    // IfcGridPlacement
    // IfcLinearPlacement
    // IfcLocalPlacement

    // === INVERSE CLAUSES ===
    // PlacesObject : SET [0:?] OF IfcProduct FOR ObjectPlacement
    // ReferencedByPlacements : SET [0:?] OF IfcObjectPlacement FOR PlacementRelTo
}
