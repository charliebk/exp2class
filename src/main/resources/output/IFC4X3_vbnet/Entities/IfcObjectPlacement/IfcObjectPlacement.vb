Public Class IfcObjectPlacement
    Public PlacementRelTo As IfcObjectPlacement

    ' === EXTENDED BY ===
    ' IfcGridPlacement
    ' IfcLinearPlacement
    ' IfcLocalPlacement

    ' === INVERSE CLAUSES ===
    ' PlacesObject : SET [0:?] OF IfcProduct FOR ObjectPlacement
    ' ReferencedByPlacements : SET [0:?] OF IfcObjectPlacement FOR PlacementRelTo
End Class
