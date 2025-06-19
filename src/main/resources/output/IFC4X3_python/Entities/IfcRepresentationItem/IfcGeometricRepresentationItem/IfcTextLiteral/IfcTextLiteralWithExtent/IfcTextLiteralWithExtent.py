class IfcTextLiteralWithExtent(IfcTextLiteral):
    def __init__(self):
        self.Extent: IfcPlanarExtent = None
        self.BoxAlignment: IfcBoxAlignment = None

    # === WHERE CLAUSES ===
    # WR31 : NOT('IFC4X3_DEV_73740fe4.IFCPLANARBOX' IN TYPEOF(Extent))
