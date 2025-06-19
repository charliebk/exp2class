public class IfcProtectiveDeviceTrippingUnit : IfcDistributionControlElement
{
    public IfcProtectiveDeviceTrippingUnitTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCPROTECTIVEDEVICETRIPPINGUNITTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
