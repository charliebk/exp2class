from typing import List

class IfcPropertyTableValue(IfcSimpleProperty):
    def __init__(self):
        self.DefiningValues: List[UNIQUE IfcValue] = None
        self.DefinedValues: List[IfcValue] = None
        self.Expression: IfcText = None
        self.DefiningUnit: IfcUnit = None
        self.DefinedUnit: IfcUnit = None
        self.CurveInterpolation: IfcCurveInterpolationEnum = None

    # === WHERE CLAUSES ===
    # WR21 : (NOT(EXISTS(DefiningValues)) AND NOT(EXISTS(DefinedValues))) OR (SIZEOF(DefiningValues) = SIZEOF(DefinedValues))
    # WR22 : NOT(EXISTS(DefiningValues)) OR (SIZEOF(QUERY(temp <* SELF.DefiningValues | TYPEOF(temp) <> TYPEOF(SELF.DefiningValues[1]) )) = 0)
    # WR23 : NOT(EXISTS(DefinedValues)) OR (SIZEOF(QUERY(temp <* SELF.DefinedValues | TYPEOF(temp) <> TYPEOF(SELF.DefinedValues[1]) )) = 0)
