class IfcAxis2PlacementLinear extends IfcPlacement {
    constructor() {
        /** @type {IFCDIRECTION} */
        this.Axis = null;
        /** @type {IFCDIRECTION} */
        this.RefDirection = null;
    }

    // === WHERE CLAUSES ===
    // WR1 : 'IFC4X3_DEV_73740fe4.IFCPOINTBYDISTANCEEXPRESSION' IN TYPEOF(SELF\IfcPlacement.Location)
    // WR2 : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0)
}
