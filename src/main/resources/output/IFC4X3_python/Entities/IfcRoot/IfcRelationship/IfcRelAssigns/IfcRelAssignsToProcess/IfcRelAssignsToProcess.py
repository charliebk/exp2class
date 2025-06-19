class IfcRelAssignsToProcess(IfcRelAssigns):
    def __init__(self):
        self.RelatingProcess: IfcProcessSelect = None
        self.QuantityInProcess: IfcMeasureWithUnit = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProcess :=: Temp)) = 0
