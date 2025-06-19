class IfcChiller(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcChillerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcChillerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChillerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCHILLERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
