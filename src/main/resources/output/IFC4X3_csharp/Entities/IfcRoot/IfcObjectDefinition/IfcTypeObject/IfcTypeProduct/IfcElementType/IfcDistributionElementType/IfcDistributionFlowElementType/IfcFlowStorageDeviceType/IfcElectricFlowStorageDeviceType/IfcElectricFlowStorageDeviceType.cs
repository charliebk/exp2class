public class IfcElectricFlowStorageDeviceType : IfcFlowStorageDeviceType
{
    public IfcElectricFlowStorageDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
