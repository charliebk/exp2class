class IfcQuantityCount(IfcPhysicalSimpleQuantity):
    def __init__(self):
        self.CountValue: IfcCountMeasure = None
        self.Formula: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR21 : CountValue >= 0
