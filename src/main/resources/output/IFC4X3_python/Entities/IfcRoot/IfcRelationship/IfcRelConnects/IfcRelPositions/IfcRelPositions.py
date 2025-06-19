class IfcRelPositions(IfcRelConnects):
    def __init__(self):
        self.RelatingPositioningElement: IfcPositioningElement = None
        self.RelatedProducts: SET [1:?] OF IfcProduct = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(temp <* RelatedProducts | RelatingPositioningElement :=: temp)) = 0
