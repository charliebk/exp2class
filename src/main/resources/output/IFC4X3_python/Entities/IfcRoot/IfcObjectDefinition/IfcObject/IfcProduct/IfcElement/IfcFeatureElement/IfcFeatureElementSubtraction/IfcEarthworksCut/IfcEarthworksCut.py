class IfcEarthworksCut(IfcFeatureElementSubtraction):
    def __init__(self):
        self.PredefinedType: IfcEarthworksCutTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksCutTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksCutTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
