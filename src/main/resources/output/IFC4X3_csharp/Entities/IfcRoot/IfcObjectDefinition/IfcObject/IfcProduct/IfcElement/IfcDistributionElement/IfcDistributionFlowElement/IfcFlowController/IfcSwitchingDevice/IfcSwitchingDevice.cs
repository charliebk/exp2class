public class IfcSwitchingDevice : IfcFlowController
{
    public IfcSwitchingDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSwitchingDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSwitchingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSWITCHINGDEVICETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
