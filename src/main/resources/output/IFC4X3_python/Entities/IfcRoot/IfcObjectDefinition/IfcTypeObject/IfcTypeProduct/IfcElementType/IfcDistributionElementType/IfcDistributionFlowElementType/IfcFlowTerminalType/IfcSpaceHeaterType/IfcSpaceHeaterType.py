class IfcSpaceHeaterType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcSpaceHeaterTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSpaceHeaterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceHeaterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
