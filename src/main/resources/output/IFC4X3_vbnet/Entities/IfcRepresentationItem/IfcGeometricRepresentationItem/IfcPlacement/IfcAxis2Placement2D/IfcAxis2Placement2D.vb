Public Class IfcAxis2Placement2D Inherits IfcPlacement
    Public RefDirection As IfcDirection

    ' === WHERE CLAUSES ===
    ' LocationIs2D : SELF\IfcPlacement.Location.Dim = 2
    ' LocationIsCP : 'IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(SELF\IfcPlacement.Location)
    ' RefDirIs2D : (NOT (EXISTS (RefDirection))) OR (RefDirection.Dim = 2)

    ' === DERIVE CLAUSES ===
    ' P : LIST [2:2] OF IfcDirection := IfcBuild2Axes(RefDirection)
End Class
