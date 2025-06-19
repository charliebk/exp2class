class IfcFlowInstrument(IfcDistributionControlElement):
    def __init__(self):
        self.PredefinedType: IfcFlowInstrumentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFlowInstrumentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowInstrumentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCFLOWINSTRUMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
