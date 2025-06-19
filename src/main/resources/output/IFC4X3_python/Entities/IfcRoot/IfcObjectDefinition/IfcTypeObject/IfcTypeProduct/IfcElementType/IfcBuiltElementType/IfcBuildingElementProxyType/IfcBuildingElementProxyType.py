class IfcBuildingElementProxyType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcBuildingElementProxyTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
