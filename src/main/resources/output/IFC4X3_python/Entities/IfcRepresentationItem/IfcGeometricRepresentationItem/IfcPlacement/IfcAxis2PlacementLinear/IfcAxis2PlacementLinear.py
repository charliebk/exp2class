class IfcAxis2PlacementLinear(IfcPlacement):
    def __init__(self):
        self.Axis: IfcDirection = None
        self.RefDirection: IfcDirection = None

    # === WHERE CLAUSES ===
    # WR1 : 'IFC4X3_DEV_73740fe4.IFCPOINTBYDISTANCEEXPRESSION' IN TYPEOF(SELF\IfcPlacement.Location)
    # WR2 : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0)
