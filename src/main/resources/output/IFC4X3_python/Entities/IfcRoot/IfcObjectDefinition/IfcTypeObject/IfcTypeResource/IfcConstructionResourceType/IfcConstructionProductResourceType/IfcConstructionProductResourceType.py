class IfcConstructionProductResourceType(IfcConstructionResourceType):
    def __init__(self):
        self.PredefinedType: IfcConstructionProductResourceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
