class IfcDirectrixCurveSweptAreaSolid(IfcSweptAreaSolid):
    def __init__(self):
        self.Directrix: IfcCurve = None
        self.StartParam: IfcCurveMeasureSelect = None
        self.EndParam: IfcCurveMeasureSelect = None

    # === EXTENDED BY ===
    # IfcFixedReferenceSweptAreaSolid
    # IfcSurfaceCurveSweptAreaSolid

    # === WHERE CLAUSES ===
    # DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
