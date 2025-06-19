class IfcSpaceHeater(IfcFlowTerminal):
    def __init__(self):
        self.PredefinedType: IfcSpaceHeaterTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSpaceHeaterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceHeaterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSPACEHEATERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
