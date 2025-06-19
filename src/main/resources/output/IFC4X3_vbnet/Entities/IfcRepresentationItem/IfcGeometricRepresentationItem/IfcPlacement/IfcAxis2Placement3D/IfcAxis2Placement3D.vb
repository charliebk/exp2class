Public Class IfcAxis2Placement3D Inherits IfcPlacement
    Public Axis As IfcDirection
    Public RefDirection As IfcDirection

    ' === WHERE CLAUSES ===
    ' AxisAndRefDirProvision : NOT ((EXISTS (Axis)) XOR (EXISTS (RefDirection)))
    ' AxisIs3D : (NOT (EXISTS (Axis))) OR (Axis.Dim = 3)
    ' AxisToRefDirPosition : (NOT (EXISTS (Axis))) OR (NOT (EXISTS (RefDirection))) OR (IfcCrossProduct(Axis,RefDirection).Magnitude > 0.0)
    ' LocationIs3D : SELF\IfcPlacement.Location.Dim = 3
    ' LocationIsCP : 'IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(SELF\IfcPlacement.Location)
    ' RefDirIs3D : (NOT (EXISTS (RefDirection))) OR (RefDirection.Dim = 3)

    ' === DERIVE CLAUSES ===
    ' P : LIST [3:3] OF IfcDirection := IfcBuildAxes(Axis, RefDirection)
End Class
