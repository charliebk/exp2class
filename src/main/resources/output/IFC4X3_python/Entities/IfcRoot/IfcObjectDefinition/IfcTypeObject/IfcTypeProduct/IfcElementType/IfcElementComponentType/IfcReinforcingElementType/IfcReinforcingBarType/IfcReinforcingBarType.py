from typing import List

class IfcReinforcingBarType(IfcReinforcingElementType):
    def __init__(self):
        self.PredefinedType: IfcReinforcingBarTypeEnum = None
        self.NominalDiameter: IfcPositiveLengthMeasure = None
        self.CrossSectionArea: IfcAreaMeasure = None
        self.BarLength: IfcPositiveLengthMeasure = None
        self.BarSurface: IfcReinforcingBarSurfaceEnum = None
        self.BendingShapeCode: IfcLabel = None
        self.BendingParameters: List[IfcBendingParameterSelect] = None

    # === WHERE CLAUSES ===
    # BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    # CorrectPredefinedType : (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
