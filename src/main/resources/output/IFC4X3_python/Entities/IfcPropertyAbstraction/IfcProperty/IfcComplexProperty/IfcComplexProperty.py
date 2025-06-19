class IfcComplexProperty(IfcProperty):
    def __init__(self):
        self.UsageName: IfcIdentifier = None
        self.HasProperties: SET [1:?] OF IfcProperty = None

    # === WHERE CLAUSES ===
    # WR21 : SIZEOF(QUERY(temp <* HasProperties | SELF :=: temp)) = 0
    # WR22 : IfcUniquePropertyName(HasProperties)
