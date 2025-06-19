class IfcPavementType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcPavementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcPavementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPavementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
