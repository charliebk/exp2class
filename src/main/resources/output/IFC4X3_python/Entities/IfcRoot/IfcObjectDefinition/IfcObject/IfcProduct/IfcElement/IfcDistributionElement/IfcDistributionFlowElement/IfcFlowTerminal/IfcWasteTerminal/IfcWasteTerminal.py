class IfcWasteTerminal(IfcFlowTerminal):
    def __init__(self):
        self.PredefinedType: IfcWasteTerminalTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWasteTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWasteTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCWASTETERMINALTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
