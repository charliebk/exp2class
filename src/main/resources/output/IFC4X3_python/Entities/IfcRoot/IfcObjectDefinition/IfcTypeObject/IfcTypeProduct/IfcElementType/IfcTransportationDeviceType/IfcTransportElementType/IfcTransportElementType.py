class IfcTransportElementType(IfcTransportationDeviceType):
    def __init__(self):
        self.PredefinedType: IfcTransportElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTransportElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTransportElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
