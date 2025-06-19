class IfcVoidingFeature(IfcFeatureElementSubtraction):
    def __init__(self):
        self.PredefinedType: IfcVoidingFeatureTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVoidingFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVoidingFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
