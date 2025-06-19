public class IfcQuantityWeight : IfcPhysicalSimpleQuantity
{
    public IfcMassMeasure WeightValue { get; set; }
    public IfcLabel Formula { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.MASSUNIT)
    // WR22 : WeightValue >= 0.
}
