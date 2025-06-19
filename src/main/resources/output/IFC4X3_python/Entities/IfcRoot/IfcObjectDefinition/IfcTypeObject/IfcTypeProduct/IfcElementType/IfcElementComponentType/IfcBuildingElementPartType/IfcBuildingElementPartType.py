class IfcBuildingElementPartType(IfcElementComponentType):
    def __init__(self):
        self.PredefinedType: IfcBuildingElementPartTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcBuildingElementPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
