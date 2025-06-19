class IfcPipeFitting(IfcFlowFitting):
    def __init__(self):
        self.PredefinedType: IfcPipeFittingTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcPipeFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCPIPEFITTINGTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
