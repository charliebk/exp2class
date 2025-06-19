public class IfcQuantityLength extends IfcPhysicalSimpleQuantity {
    public IfcLengthMeasure LengthValue;
    public IfcLabel Formula;

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.LENGTHUNIT)
    // WR22 : LengthValue >= 0.
}
