class IfcProjectionElement(IfcFeatureElementAddition):
    def __init__(self):
        self.PredefinedType: IfcProjectionElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProjectionElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProjectionElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
