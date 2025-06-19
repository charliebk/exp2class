class IfcQuantityArea(IfcPhysicalSimpleQuantity):
    def __init__(self):
        self.AreaValue: IfcAreaMeasure = None
        self.Formula: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.AREAUNIT)
    # WR22 : AreaValue >= 0.
