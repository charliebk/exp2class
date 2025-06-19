public class IfcQuantityArea : IfcPhysicalSimpleQuantity
{
    public IfcAreaMeasure AreaValue { get; set; }
    public IfcLabel Formula { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.AREAUNIT)
    // WR22 : AreaValue >= 0.
}
