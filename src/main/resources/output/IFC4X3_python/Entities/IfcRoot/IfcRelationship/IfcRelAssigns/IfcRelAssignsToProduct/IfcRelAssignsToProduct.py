class IfcRelAssignsToProduct(IfcRelAssigns):
    def __init__(self):
        self.RelatingProduct: IfcProductSelect = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProduct :=: Temp)) = 0
