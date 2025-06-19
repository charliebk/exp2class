public class IfcQuantityWeight extends IfcPhysicalSimpleQuantity {
    public IfcMassMeasure WeightValue;
    public IfcLabel Formula;

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.MASSUNIT)
    // WR22 : WeightValue >= 0.
}
