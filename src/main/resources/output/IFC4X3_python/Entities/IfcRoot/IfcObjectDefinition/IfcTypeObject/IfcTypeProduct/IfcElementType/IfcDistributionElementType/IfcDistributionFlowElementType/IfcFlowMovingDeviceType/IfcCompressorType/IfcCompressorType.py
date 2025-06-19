class IfcCompressorType(IfcFlowMovingDeviceType):
    def __init__(self):
        self.PredefinedType: IfcCompressorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCompressorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCompressorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
