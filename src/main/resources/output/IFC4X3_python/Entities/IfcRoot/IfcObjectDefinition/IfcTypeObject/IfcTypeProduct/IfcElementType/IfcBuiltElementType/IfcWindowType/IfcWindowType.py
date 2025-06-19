class IfcWindowType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcWindowTypeEnum = None
        self.PartitioningType: IfcWindowTypePartitioningEnum = None
        self.ParameterTakesPrecedence: IfcBoolean = None
        self.UserDefinedPartitioningType: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
