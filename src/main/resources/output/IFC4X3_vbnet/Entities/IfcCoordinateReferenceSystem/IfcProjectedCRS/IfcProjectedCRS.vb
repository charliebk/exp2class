Public Class IfcProjectedCRS Inherits IfcCoordinateReferenceSystem
    Public VerticalDatum As IfcIdentifier
    Public MapProjection As IfcIdentifier
    Public MapZone As IfcIdentifier
    Public MapUnit As IfcNamedUnit

    ' === WHERE CLAUSES ===
    ' MapUnitIsLength : NOT(EXISTS(SELF.MapUnit)) OR (SELF.MapUnit.UnitType = IfcUnitEnum.LENGTHUNIT)
End Class
