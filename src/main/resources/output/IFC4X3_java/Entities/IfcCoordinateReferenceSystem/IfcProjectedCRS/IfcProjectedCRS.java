public class IfcProjectedCRS extends IfcCoordinateReferenceSystem {
    public IfcIdentifier VerticalDatum;
    public IfcIdentifier MapProjection;
    public IfcIdentifier MapZone;
    public IfcNamedUnit MapUnit;

    // === WHERE CLAUSES ===
    // MapUnitIsLength : NOT(EXISTS(SELF.MapUnit)) OR (SELF.MapUnit.UnitType = IfcUnitEnum.LENGTHUNIT)
}
