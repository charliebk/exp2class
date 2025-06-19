class IfcTextLiteral(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Literal: IfcPresentableText = None
        self.Placement: IfcAxis2Placement = None
        self.Path: IfcTextPath = None

    # === EXTENDED BY ===
    # IfcTextLiteralWithExtent
