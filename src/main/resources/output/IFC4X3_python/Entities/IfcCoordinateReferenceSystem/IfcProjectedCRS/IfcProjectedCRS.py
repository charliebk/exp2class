class IfcProjectedCRS(IfcCoordinateReferenceSystem):
    def __init__(self):
        self.VerticalDatum: IfcIdentifier = None
        self.MapProjection: IfcIdentifier = None
        self.MapZone: IfcIdentifier = None
        self.MapUnit: IfcNamedUnit = None

    # === WHERE CLAUSES ===
    # MapUnitIsLength : NOT(EXISTS(SELF.MapUnit)) OR (SELF.MapUnit.UnitType = IfcUnitEnum.LENGTHUNIT)
