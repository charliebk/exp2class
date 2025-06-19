from typing import List

class IfcPropertyListValue(IfcSimpleProperty):
    def __init__(self):
        self.ListValues: List[IfcValue] = None
        self.Unit: IfcUnit = None

    # === WHERE CLAUSES ===
    # WR31 : SIZEOF(QUERY(temp <* SELF.ListValues | NOT(TYPEOF(SELF.ListValues[1]) = TYPEOF(temp)) )) = 0
