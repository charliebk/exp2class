class IfcBurner(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcBurnerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBurnerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBurnerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCBURNERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
