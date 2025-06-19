Public Class IfcGeographicCRS Inherits IfcCoordinateReferenceSystem
    Public PrimeMeridian As IfcIdentifier
    Public AngleUnit As IfcNamedUnit
    Public HeightUnit As IfcNamedUnit

    ' === WHERE CLAUSES ===
    ' AngleUnitIsPlaneAngle : NOT(EXISTS(SELF.AngleUnit)) OR (SELF.AngleUnit.UnitType=IfcUnitEnum.PLANEANGLEUNIT)
    ' HeightUnitIsLength : NOT(EXISTS(SELF.HeightUnit)) OR (SELF.HeightUnit.UnitType=IfcUnitEnum.LENGTHUNIT)
End Class
