class IfcFlowMeter(IfcFlowController):
    def __init__(self):
        self.PredefinedType: IfcFlowMeterTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFlowMeterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowMeterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCFLOWMETERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
