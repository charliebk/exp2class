public class IfcAxis2PlacementLinear extends IfcPlacement {
    public IfcDirection Axis;
    public IfcDirection RefDirection;

    // === WHERE CLAUSES ===
    // WR1 : 'IFC4X3_DEV_73740fe4.IFCPOINTBYDISTANCEEXPRESSION' IN TYPEOF(SELF\IfcPlacement.Location)
    // WR2 : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0)
}
