class IfcCrewResourceType(IfcConstructionResourceType):
    def __init__(self):
        self.PredefinedType: IfcCrewResourceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
