class IfcBuiltSystem(IfcSystem):
    def __init__(self):
        self.PredefinedType: IfcBuiltSystemTypeEnum = None
        self.LongName: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuiltSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuiltSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
