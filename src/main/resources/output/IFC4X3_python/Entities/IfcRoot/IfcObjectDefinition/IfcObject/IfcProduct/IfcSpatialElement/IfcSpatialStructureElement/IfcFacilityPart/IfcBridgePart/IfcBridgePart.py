class IfcBridgePart(IfcFacilityPart):
    def __init__(self):
        self.PredefinedType: IfcBridgePartTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBridgePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBridgePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
