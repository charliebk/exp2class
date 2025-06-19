class IfcTrimmedCurve(IfcBoundedCurve):
    def __init__(self):
        self.BasisCurve: IfcCurve = None
        self.Trim1: SET [1:2] OF IfcTrimmingSelect = None
        self.Trim2: SET [1:2] OF IfcTrimmingSelect = None
        self.SenseAgreement: IfcBoolean = None
        self.MasterRepresentation: IfcTrimmingPreference = None

    # === WHERE CLAUSES ===
    # NoTrimOfBoundedCurves : NOT('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(BasisCurve))
    # Trim1ValuesConsistent : (HIINDEX(Trim1) = 1) OR (TYPEOF(Trim1[1]) <> TYPEOF(Trim1[2]))
    # Trim2ValuesConsistent : (HIINDEX(Trim2) = 1) OR (TYPEOF(Trim2[1]) <> TYPEOF(Trim2[2]))
