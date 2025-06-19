class IfcQuantityVolume(IfcPhysicalSimpleQuantity):
    def __init__(self):
        self.VolumeValue: IfcVolumeMeasure = None
        self.Formula: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.VOLUMEUNIT)
    # WR22 : VolumeValue >= 0.
