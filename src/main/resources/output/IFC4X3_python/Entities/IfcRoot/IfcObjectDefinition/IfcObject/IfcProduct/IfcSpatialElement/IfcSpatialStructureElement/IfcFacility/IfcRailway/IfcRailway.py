class IfcRailway(IfcFacility):
    def __init__(self):
        self.PredefinedType: IfcRailwayTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
