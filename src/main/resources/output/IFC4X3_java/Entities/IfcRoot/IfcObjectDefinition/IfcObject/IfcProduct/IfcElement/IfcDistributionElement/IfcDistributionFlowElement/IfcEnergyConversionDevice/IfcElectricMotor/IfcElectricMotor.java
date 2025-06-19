public class IfcElectricMotor extends IfcEnergyConversionDevice {
    public IfcElectricMotorTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcElectricMotorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricMotorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCELECTRICMOTORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
