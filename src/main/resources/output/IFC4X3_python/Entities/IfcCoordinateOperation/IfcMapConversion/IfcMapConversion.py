class IfcMapConversion(IfcCoordinateOperation):
    def __init__(self):
        self.Eastings: IfcLengthMeasure = None
        self.Northings: IfcLengthMeasure = None
        self.OrthogonalHeight: IfcLengthMeasure = None
        self.XAxisAbscissa: IfcReal = None
        self.XAxisOrdinate: IfcReal = None
        self.Scale: IfcReal = None

    # === EXTENDED BY ===
    # IfcMapConversionScaled

    # === WHERE CLAUSES ===
    # TargetCRSOnlyProjected : 'IFC4X3_DEV_73740fe4.IFCPROJECTEDCRS' IN TYPEOF(SELF\IfcCoordinateOperation.TargetCRS)
