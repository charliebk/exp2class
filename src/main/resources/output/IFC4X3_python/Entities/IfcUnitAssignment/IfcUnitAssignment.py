class IfcUnitAssignment:
    def __init__(self):
        self.Units: SET [1:?] OF IfcUnit = None

    # === WHERE CLAUSES ===
    # WR01 : IfcCorrectUnitAssignment(Units)
