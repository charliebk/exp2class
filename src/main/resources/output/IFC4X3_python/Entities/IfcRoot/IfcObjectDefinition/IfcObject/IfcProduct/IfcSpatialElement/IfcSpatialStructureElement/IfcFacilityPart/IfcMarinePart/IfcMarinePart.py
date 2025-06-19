class IfcMarinePart(IfcFacilityPart):
    def __init__(self):
        self.PredefinedType: IfcMarinePartTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarinePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarinePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
