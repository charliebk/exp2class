class IfcPhysicalSimpleQuantity(IfcPhysicalQuantity):
    def __init__(self):
        self.Unit: IfcNamedUnit = None

    # === EXTENDED BY ===
    # IfcQuantityArea
    # IfcQuantityCount
    # IfcQuantityLength
    # IfcQuantityNumber
    # IfcQuantityTime
    # IfcQuantityVolume
    # IfcQuantityWeight
