class IfcBridge(IfcFacility):
    def __init__(self):
        self.PredefinedType: IfcBridgeTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBridgeTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBridgeTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
