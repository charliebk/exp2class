Public Class IfcAxis2PlacementLinear Inherits IfcPlacement
    Public Axis As IfcDirection
    Public RefDirection As IfcDirection

    ' === WHERE CLAUSES ===
    ' WR1 : 'IFC4X3_DEV_73740fe4.IFCPOINTBYDISTANCEEXPRESSION' IN TYPEOF(SELF\IfcPlacement.Location)
    ' WR2 : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0)
End Class
