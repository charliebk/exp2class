public class IfcGeographicCRS extends IfcCoordinateReferenceSystem {
    public IfcIdentifier PrimeMeridian;
    public IfcNamedUnit AngleUnit;
    public IfcNamedUnit HeightUnit;

    // === WHERE CLAUSES ===
    // AngleUnitIsPlaneAngle : NOT(EXISTS(SELF.AngleUnit)) OR (SELF.AngleUnit.UnitType=IfcUnitEnum.PLANEANGLEUNIT)
    // HeightUnitIsLength : NOT(EXISTS(SELF.HeightUnit)) OR (SELF.HeightUnit.UnitType=IfcUnitEnum.LENGTHUNIT)
}
