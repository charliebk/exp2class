# SELECT TYPE IfcCurveStyleFontSelect
# Options:
# - IfcCurveStyleFont
# - IfcPreDefinedCurveFont
class IfcCurveStyleFontSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcCurveStyleFont, IfcPreDefinedCurveFont)):
            raise TypeError("value must be one of: IfcCurveStyleFont, IfcPreDefinedCurveFont")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
