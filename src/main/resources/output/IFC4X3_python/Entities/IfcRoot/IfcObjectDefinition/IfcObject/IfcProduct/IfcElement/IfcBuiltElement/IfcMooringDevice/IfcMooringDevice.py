class IfcMooringDevice(IfcBuiltElement):
    def __init__(self):
        self.PredefinedType: IfcMooringDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMooringDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMooringDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCMOORINGDEVICETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
