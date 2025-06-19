# SELECT TYPE IfcCurveFontOrScaledCurveFontSelect
# Options:
# - IfcCurveStyleFontAndScaling
# - IfcCurveStyleFontSelect
class IfcCurveFontOrScaledCurveFontSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcCurveStyleFontAndScaling, IfcCurveStyleFontSelect)):
            raise TypeError("value must be one of: IfcCurveStyleFontAndScaling, IfcCurveStyleFontSelect")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
