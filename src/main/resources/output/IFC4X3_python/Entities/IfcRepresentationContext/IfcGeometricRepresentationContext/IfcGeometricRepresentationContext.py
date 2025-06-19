class IfcGeometricRepresentationContext(IfcRepresentationContext):
    def __init__(self):
        self.CoordinateSpaceDimension: IfcDimensionCount = None
        self.Precision: IfcReal = None
        self.WorldCoordinateSystem: IfcAxis2Placement = None
        self.TrueNorth: IfcDirection = None

    # === EXTENDED BY ===
    # IfcGeometricRepresentationSubContext

    # === INVERSE CLAUSES ===
    # HasSubContexts : SET [0:?] OF IfcGeometricRepresentationSubContext FOR ParentContext
    # HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS

    # === WHERE CLAUSES ===
    # North2D : NOT(EXISTS(TrueNorth)) OR (HIINDEX(TrueNorth.DirectionRatios) = 2)
