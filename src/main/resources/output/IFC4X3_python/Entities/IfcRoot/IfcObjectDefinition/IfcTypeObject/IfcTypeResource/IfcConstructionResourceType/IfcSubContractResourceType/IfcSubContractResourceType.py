class IfcSubContractResourceType(IfcConstructionResourceType):
    def __init__(self):
        self.PredefinedType: IfcSubContractResourceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
