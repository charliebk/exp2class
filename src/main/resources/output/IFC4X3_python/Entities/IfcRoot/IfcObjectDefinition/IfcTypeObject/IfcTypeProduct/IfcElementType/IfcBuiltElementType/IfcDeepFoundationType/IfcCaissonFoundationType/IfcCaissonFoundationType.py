class IfcCaissonFoundationType(IfcDeepFoundationType):
    def __init__(self):
        self.PredefinedType: IfcCaissonFoundationTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCaissonFoundationTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCaissonFoundationTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
