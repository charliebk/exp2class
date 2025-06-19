class IfcCooledBeam(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcCooledBeamTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCooledBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCooledBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCOOLEDBEAMTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
