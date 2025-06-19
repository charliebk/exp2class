class IfcVehicleType(IfcTransportationDeviceType):
    def __init__(self):
        self.PredefinedType: IfcVehicleTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcVehicleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVehicleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
