class IfcRoad(IfcFacility):
    def __init__(self):
        self.PredefinedType: IfcRoadTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
