public class IfcQuantityVolume : IfcPhysicalSimpleQuantity
{
    public IfcVolumeMeasure VolumeValue { get; set; }
    public IfcLabel Formula { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.VOLUMEUNIT)
    // WR22 : VolumeValue >= 0.
}
