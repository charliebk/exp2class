Public Class IfcAxis1Placement Inherits IfcPlacement
    Public Axis As IfcDirection

    ' === WHERE CLAUSES ===
    ' AxisIs3D : (NOT (EXISTS (Axis))) OR (Axis.Dim = 3)
    ' LocationIs3D : SELF\IfcPlacement.Location.Dim = 3
    ' LocationIsCP : 'IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(SELF\IfcPlacement.Location)

    ' === DERIVE CLAUSES ===
    ' Z : IfcDirection := NVL (IfcNormalise(Axis), IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcDirection([0.0,0.0,1.0]))
End Class
