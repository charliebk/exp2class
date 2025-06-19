class IfcMarineFacility(IfcFacility):
    def __init__(self):
        self.PredefinedType: IfcMarineFacilityTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarineFacilityTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarineFacilityTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
