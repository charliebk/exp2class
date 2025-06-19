public class IfcElectricFlowTreatmentDevice : IfcFlowTreatmentDevice
{
    public IfcElectricFlowTreatmentDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCELECTRICFLOWTREATMENTDEVICETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
