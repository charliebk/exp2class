public class IfcQuantityLength : IfcPhysicalSimpleQuantity
{
    public IfcLengthMeasure LengthValue { get; set; }
    public IfcLabel Formula { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.LENGTHUNIT)
    // WR22 : LengthValue >= 0.
}
