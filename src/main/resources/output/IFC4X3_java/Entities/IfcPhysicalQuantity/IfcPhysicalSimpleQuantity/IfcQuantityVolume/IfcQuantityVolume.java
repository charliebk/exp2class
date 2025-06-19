public class IfcQuantityVolume extends IfcPhysicalSimpleQuantity {
    public IfcVolumeMeasure VolumeValue;
    public IfcLabel Formula;

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.VOLUMEUNIT)
    // WR22 : VolumeValue >= 0.
}
