class IfcEngine extends IfcEnergyConversionDevice {
    constructor() {
        /** @type {IFCENGINETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCENGINETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
