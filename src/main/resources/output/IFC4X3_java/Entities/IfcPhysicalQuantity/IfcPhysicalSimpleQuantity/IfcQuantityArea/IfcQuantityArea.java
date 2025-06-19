public class IfcQuantityArea extends IfcPhysicalSimpleQuantity {
    public IfcAreaMeasure AreaValue;
    public IfcLabel Formula;

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.AREAUNIT)
    // WR22 : AreaValue >= 0.
}
