class IfcCondenser(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcCondenserTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCONDENSERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
