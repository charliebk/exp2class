class IfcCableFitting(IfcFlowFitting):
    def __init__(self):
        self.PredefinedType: IfcCableFittingTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCableFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCABLEFITTINGTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
