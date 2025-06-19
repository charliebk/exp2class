class IfcRailwayPart(IfcFacilityPart):
    def __init__(self):
        self.PredefinedType: IfcRailwayPartTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
