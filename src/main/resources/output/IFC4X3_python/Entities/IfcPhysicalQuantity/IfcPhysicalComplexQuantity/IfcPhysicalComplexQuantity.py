class IfcPhysicalComplexQuantity(IfcPhysicalQuantity):
    def __init__(self):
        self.HasQuantities: SET [1:?] OF IfcPhysicalQuantity = None
        self.Discrimination: IfcLabel = None
        self.Quality: IfcLabel = None
        self.Usage: IfcLabel = None

    # === WHERE CLAUSES ===
    # NoSelfReference : SIZEOF(QUERY(temp <* HasQuantities | SELF :=: temp)) = 0
    # UniqueQuantityNames : IfcUniqueQuantityNames(HasQuantities)
