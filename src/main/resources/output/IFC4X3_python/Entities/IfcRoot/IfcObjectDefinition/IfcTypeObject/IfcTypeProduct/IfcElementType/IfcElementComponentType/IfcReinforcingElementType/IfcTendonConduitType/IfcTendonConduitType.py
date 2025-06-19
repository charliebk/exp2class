class IfcTendonConduitType(IfcReinforcingElementType):
    def __init__(self):
        self.PredefinedType: IfcTendonConduitTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTendonConduitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonConduitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
