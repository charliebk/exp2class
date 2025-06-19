class IfcTextStyleTextModel(IfcPresentationItem):
    def __init__(self):
        self.TextIndent: IfcSizeSelect = None
        self.TextAlign: IfcTextAlignment = None
        self.TextDecoration: IfcTextDecoration = None
        self.LetterSpacing: IfcSizeSelect = None
        self.WordSpacing: IfcSizeSelect = None
        self.TextTransform: IfcTextTransformation = None
        self.LineHeight: IfcSizeSelect = None
