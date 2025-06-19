class IfcElectricFlowStorageDevice extends IfcFlowStorageDevice {
    constructor() {
        /** @type {IFCELECTRICFLOWSTORAGEDEVICETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCELECTRICFLOWSTORAGEDEVICETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
