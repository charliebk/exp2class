class IfcTrackElementType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcTrackElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTrackElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTrackElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
