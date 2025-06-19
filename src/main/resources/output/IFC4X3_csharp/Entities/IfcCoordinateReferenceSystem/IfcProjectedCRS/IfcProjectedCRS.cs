public class IfcProjectedCRS : IfcCoordinateReferenceSystem
{
    public IfcIdentifier VerticalDatum { get; set; }
    public IfcIdentifier MapProjection { get; set; }
    public IfcIdentifier MapZone { get; set; }
    public IfcNamedUnit MapUnit { get; set; }

    // === WHERE CLAUSES ===
    // MapUnitIsLength : NOT(EXISTS(SELF.MapUnit)) OR (SELF.MapUnit.UnitType = IfcUnitEnum.LENGTHUNIT)
}
