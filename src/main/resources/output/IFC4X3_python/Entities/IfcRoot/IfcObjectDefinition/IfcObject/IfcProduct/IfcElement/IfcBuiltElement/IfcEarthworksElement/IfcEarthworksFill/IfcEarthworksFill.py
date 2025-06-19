class IfcEarthworksFill(IfcEarthworksElement):
    def __init__(self):
        self.PredefinedType: IfcEarthworksFillTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksFillTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksFillTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
