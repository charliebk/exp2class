class IfcFacilityPartCommon(IfcFacilityPart):
    def __init__(self):
        self.PredefinedType: IfcFacilityPartCommonTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFacilityPartCommonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFacilityPartCommonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
