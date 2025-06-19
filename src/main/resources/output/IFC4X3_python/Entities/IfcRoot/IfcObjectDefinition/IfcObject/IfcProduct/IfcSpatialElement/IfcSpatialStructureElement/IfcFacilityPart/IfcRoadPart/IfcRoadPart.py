class IfcRoadPart(IfcFacilityPart):
    def __init__(self):
        self.PredefinedType: IfcRoadPartTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
