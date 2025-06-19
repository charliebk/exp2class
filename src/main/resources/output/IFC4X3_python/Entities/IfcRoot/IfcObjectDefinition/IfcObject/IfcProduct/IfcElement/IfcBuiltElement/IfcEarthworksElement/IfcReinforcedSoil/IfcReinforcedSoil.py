class IfcReinforcedSoil(IfcEarthworksElement):
    def __init__(self):
        self.PredefinedType: IfcReinforcedSoilTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcedSoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcedSoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
