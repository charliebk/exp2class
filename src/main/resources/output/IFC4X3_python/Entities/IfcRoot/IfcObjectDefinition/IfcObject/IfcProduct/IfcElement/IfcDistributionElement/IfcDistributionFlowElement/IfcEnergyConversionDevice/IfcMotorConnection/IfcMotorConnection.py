class IfcMotorConnection(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcMotorConnectionTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCMOTORCONNECTIONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
