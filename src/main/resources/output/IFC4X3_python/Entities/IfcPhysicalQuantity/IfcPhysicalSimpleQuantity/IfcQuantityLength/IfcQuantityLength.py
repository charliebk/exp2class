class IfcQuantityLength(IfcPhysicalSimpleQuantity):
    def __init__(self):
        self.LengthValue: IfcLengthMeasure = None
        self.Formula: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.LENGTHUNIT)
    # WR22 : LengthValue >= 0.
