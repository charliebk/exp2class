class IfcVirtualElement(IfcElement):
    def __init__(self):
        self.PredefinedType: IfcVirtualElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVirtualElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVirtualElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
