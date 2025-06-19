class IfcElementQuantity(IfcQuantitySet):
    def __init__(self):
        self.MethodOfMeasurement: IfcLabel = None
        self.Quantities: SET [1:?] OF IfcPhysicalQuantity = None

    # === WHERE CLAUSES ===
    # UniqueQuantityNames : IfcUniqueQuantityNames(Quantities)
