class IfcEvaporator(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcEvaporatorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEvaporatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEvaporatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCEVAPORATORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
