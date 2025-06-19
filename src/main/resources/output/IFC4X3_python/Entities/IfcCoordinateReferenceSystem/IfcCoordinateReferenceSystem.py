class IfcCoordinateReferenceSystem:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.GeodeticDatum: IfcIdentifier = None

    # === EXTENDED BY ===
    # IfcGeographicCRS
    # IfcProjectedCRS

    # === INVERSE CLAUSES ===
    # HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS
    # WellKnownText : SET [0:1] OF IfcWellKnownText FOR CoordinateReferenceSystem

    # === WHERE CLAUSES ===
    # NameOrWKT : (HIINDEX(WellKnownText) = 1) OR EXISTS(Name)
