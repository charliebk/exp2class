class IfcRectangularTrimmedSurface(IfcBoundedSurface):
    def __init__(self):
        self.BasisSurface: IfcSurface = None
        self.U1: IfcParameterValue = None
        self.V1: IfcParameterValue = None
        self.U2: IfcParameterValue = None
        self.V2: IfcParameterValue = None
        self.Usense: IfcBoolean = None
        self.Vsense: IfcBoolean = None

    # === WHERE CLAUSES ===
    # U1AndU2Different : U1 <> U2
    # UsenseCompatible : (('IFC4X3_DEV_73740fe4.IFCELEMENTARYSURFACE' IN TYPEOF(BasisSurface)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCPLANE' IN TYPEOF(BasisSurface)))) OR ('IFC4X3_DEV_73740fe4.IFCSURFACEOFREVOLUTION' IN TYPEOF(BasisSurface)) OR (Usense = (U2 > U1))
    # V1AndV2Different : V1 <> V2
    # VsenseCompatible : Vsense = (V2 > V1)
