class IfcAirToAirHeatRecovery(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcAirToAirHeatRecoveryTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCAIRTOAIRHEATRECOVERYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
