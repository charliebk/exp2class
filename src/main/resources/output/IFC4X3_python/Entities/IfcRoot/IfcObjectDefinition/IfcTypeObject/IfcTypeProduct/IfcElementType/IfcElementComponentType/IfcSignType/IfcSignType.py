class IfcSignType(IfcElementComponentType):
    def __init__(self):
        self.PredefinedType: IfcSignTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSignTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
