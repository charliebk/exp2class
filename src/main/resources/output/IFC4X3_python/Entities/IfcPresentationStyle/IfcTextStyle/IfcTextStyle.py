class IfcTextStyle(IfcPresentationStyle):
    def __init__(self):
        self.TextCharacterAppearance: IfcTextStyleForDefinedFont = None
        self.TextStyle: IfcTextStyleTextModel = None
        self.TextFontStyle: IfcTextFontSelect = None
        self.ModelOrDraughting: IfcBoolean = None
