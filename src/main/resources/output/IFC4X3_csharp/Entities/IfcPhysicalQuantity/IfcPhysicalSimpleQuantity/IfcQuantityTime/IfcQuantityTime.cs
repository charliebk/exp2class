public class IfcQuantityTime : IfcPhysicalSimpleQuantity
{
    public IfcTimeMeasure TimeValue { get; set; }
    public IfcLabel Formula { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.TIMEUNIT)
    // WR22 : TimeValue >= 0.
}
