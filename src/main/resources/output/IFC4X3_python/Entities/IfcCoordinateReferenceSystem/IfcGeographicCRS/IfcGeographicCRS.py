class IfcGeographicCRS(IfcCoordinateReferenceSystem):
    def __init__(self):
        self.PrimeMeridian: IfcIdentifier = None
        self.AngleUnit: IfcNamedUnit = None
        self.HeightUnit: IfcNamedUnit = None

    # === WHERE CLAUSES ===
    # AngleUnitIsPlaneAngle : NOT(EXISTS(SELF.AngleUnit)) OR (SELF.AngleUnit.UnitType=IfcUnitEnum.PLANEANGLEUNIT)
    # HeightUnitIsLength : NOT(EXISTS(SELF.HeightUnit)) OR (SELF.HeightUnit.UnitType=IfcUnitEnum.LENGTHUNIT)
