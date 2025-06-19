public class IfcGeographicCRS : IfcCoordinateReferenceSystem
{
    public IfcIdentifier PrimeMeridian { get; set; }
    public IfcNamedUnit AngleUnit { get; set; }
    public IfcNamedUnit HeightUnit { get; set; }

    // === WHERE CLAUSES ===
    // AngleUnitIsPlaneAngle : NOT(EXISTS(SELF.AngleUnit)) OR (SELF.AngleUnit.UnitType=IfcUnitEnum.PLANEANGLEUNIT)
    // HeightUnitIsLength : NOT(EXISTS(SELF.HeightUnit)) OR (SELF.HeightUnit.UnitType=IfcUnitEnum.LENGTHUNIT)
}
