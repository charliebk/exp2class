class IfcDoorType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcDoorTypeEnum = None
        self.OperationType: IfcDoorTypeOperationEnum = None
        self.ParameterTakesPrecedence: IfcBoolean = None
        self.UserDefinedOperationType: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
