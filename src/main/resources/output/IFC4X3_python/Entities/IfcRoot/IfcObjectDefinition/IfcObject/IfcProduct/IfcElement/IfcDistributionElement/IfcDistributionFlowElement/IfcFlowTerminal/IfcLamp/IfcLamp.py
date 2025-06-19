class IfcLamp(IfcFlowTerminal):
    def __init__(self):
        self.PredefinedType: IfcLampTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcLampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCLAMPTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
