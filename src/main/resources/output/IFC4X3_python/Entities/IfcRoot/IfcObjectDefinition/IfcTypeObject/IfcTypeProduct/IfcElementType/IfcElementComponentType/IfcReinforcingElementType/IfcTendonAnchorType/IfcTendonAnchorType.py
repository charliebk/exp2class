class IfcTendonAnchorType(IfcReinforcingElementType):
    def __init__(self):
        self.PredefinedType: IfcTendonAnchorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTendonAnchorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonAnchorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
