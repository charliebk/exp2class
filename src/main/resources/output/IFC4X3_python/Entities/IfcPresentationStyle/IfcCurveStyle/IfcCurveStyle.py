class IfcCurveStyle(IfcPresentationStyle):
    def __init__(self):
        self.CurveFont: IfcCurveFontOrScaledCurveFontSelect = None
        self.CurveWidth: IfcSizeSelect = None
        self.CurveColour: IfcColour = None
        self.ModelOrDraughting: IfcBoolean = None

    # === WHERE CLAUSES ===
    # IdentifiableCurveStyle : EXISTS(CurveFont) OR EXISTS(CurveWidth) OR EXISTS(CurveColour)
    # MeasureOfWidth : (NOT(EXISTS(CurveWidth))) OR ('IFC4X3_DEV_73740fe4.IFCPOSITIVELENGTHMEASURE' IN TYPEOF(CurveWidth)) OR (('IFC4X3_DEV_73740fe4.IFCDESCRIPTIVEMEASURE' IN TYPEOF(CurveWidth)) AND (CurveWidth = 'by layer'))
