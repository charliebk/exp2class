public class IfcAirToAirHeatRecovery extends IfcEnergyConversionDevice {
    public IfcAirToAirHeatRecoveryTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCAIRTOAIRHEATRECOVERYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
