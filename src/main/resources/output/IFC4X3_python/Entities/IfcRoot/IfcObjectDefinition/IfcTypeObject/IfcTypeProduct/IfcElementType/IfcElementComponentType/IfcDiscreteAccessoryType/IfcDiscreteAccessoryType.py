class IfcDiscreteAccessoryType(IfcElementComponentType):
    def __init__(self):
        self.PredefinedType: IfcDiscreteAccessoryTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcDiscreteAccessoryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDiscreteAccessoryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
