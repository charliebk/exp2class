class IfcConstructionMaterialResourceType(IfcConstructionResourceType):
    def __init__(self):
        self.PredefinedType: IfcConstructionMaterialResourceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
