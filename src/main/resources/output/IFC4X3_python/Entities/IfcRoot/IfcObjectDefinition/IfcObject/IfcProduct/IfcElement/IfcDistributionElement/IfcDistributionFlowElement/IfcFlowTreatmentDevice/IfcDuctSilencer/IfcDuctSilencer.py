class IfcDuctSilencer(IfcFlowTreatmentDevice):
    def __init__(self):
        self.PredefinedType: IfcDuctSilencerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDuctSilencerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSilencerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDUCTSILENCERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
