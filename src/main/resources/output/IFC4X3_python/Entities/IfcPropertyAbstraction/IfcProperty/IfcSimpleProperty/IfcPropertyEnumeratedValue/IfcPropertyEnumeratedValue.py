from typing import List

class IfcPropertyEnumeratedValue(IfcSimpleProperty):
    def __init__(self):
        self.EnumerationValues: List[IfcValue] = None
        self.EnumerationReference: IfcPropertyEnumeration = None

    # === WHERE CLAUSES ===
    # WR21 : NOT(EXISTS(EnumerationReference)) OR  NOT(EXISTS(EnumerationValues)) OR  (SIZEOF(QUERY(temp <* EnumerationValues | temp IN EnumerationReference.EnumerationValues)) = SIZEOF(EnumerationValues))
