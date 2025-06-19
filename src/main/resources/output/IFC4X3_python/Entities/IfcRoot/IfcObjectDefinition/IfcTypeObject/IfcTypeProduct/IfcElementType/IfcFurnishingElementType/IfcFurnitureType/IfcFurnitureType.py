class IfcFurnitureType(IfcFurnishingElementType):
    def __init__(self):
        self.AssemblyPlace: IfcAssemblyPlaceEnum = None
        self.PredefinedType: IfcFurnitureTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
