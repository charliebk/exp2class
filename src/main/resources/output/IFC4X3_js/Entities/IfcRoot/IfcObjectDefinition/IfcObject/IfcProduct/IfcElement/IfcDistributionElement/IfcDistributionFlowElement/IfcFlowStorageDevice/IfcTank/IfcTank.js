class IfcTank extends IfcFlowStorageDevice {
    constructor() {
        /** @type {IFCTANKTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTankTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTankTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTANKTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
