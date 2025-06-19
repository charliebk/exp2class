class IfcSystemFurnitureElementType(IfcFurnishingElementType):
    def __init__(self):
        self.PredefinedType: IfcSystemFurnitureElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSystemFurnitureElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSystemFurnitureElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
