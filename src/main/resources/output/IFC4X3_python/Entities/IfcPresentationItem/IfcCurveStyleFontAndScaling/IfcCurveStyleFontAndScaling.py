class IfcCurveStyleFontAndScaling(IfcPresentationItem):
    def __init__(self):
        self.Name: IfcLabel = None
        self.CurveStyleFont: IfcCurveStyleFontSelect = None
        self.CurveFontScaling: IfcPositiveRatioMeasure = None
