class IfcFan extends IfcFlowMovingDevice {
    constructor() {
        /** @type {IFCFANTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFanTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFanTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCFANTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
