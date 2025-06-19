class IfcQuantityTime(IfcPhysicalSimpleQuantity):
    def __init__(self):
        self.TimeValue: IfcTimeMeasure = None
        self.Formula: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.TIMEUNIT)
    # WR22 : TimeValue >= 0.
