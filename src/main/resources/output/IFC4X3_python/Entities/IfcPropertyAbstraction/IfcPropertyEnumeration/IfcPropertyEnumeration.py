from typing import List

class IfcPropertyEnumeration(IfcPropertyAbstraction):
    def __init__(self):
        self.Name: IfcLabel = None
        self.EnumerationValues: List[UNIQUE IfcValue] = None
        self.Unit: IfcUnit = None

    # === WHERE CLAUSES ===
    # WR01 : SIZEOF(QUERY(temp <* SELF.EnumerationValues | NOT(TYPEOF(SELF.EnumerationValues[1]) = TYPEOF(temp)) )) = 0

    # === UNIQUE CLAUSES ===
    # UR1 : Name
