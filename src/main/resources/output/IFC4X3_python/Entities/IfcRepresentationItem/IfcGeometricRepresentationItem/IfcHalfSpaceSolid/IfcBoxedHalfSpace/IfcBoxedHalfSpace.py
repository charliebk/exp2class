class IfcBoxedHalfSpace(IfcHalfSpaceSolid):
    def __init__(self):
        self.Enclosure: IfcBoundingBox = None

    # === WHERE CLAUSES ===
    # UnboundedSurface : NOT ('IFC4X3_DEV_73740fe4.IFCCURVEBOUNDEDPLANE' IN TYPEOF(SELF\IfcHalfSpaceSolid.BaseSurface))
