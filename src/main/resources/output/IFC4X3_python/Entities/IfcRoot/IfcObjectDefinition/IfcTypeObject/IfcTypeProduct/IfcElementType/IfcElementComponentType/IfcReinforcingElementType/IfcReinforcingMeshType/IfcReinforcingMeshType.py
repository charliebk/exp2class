from typing import List

class IfcReinforcingMeshType(IfcReinforcingElementType):
    def __init__(self):
        self.PredefinedType: IfcReinforcingMeshTypeEnum = None
        self.MeshLength: IfcPositiveLengthMeasure = None
        self.MeshWidth: IfcPositiveLengthMeasure = None
        self.LongitudinalBarNominalDiameter: IfcPositiveLengthMeasure = None
        self.TransverseBarNominalDiameter: IfcPositiveLengthMeasure = None
        self.LongitudinalBarCrossSectionArea: IfcAreaMeasure = None
        self.TransverseBarCrossSectionArea: IfcAreaMeasure = None
        self.LongitudinalBarSpacing: IfcPositiveLengthMeasure = None
        self.TransverseBarSpacing: IfcPositiveLengthMeasure = None
        self.BendingShapeCode: IfcLabel = None
        self.BendingParameters: List[IfcBendingParameterSelect] = None

    # === WHERE CLAUSES ===
    # BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    # CorrectPredefinedType : (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
