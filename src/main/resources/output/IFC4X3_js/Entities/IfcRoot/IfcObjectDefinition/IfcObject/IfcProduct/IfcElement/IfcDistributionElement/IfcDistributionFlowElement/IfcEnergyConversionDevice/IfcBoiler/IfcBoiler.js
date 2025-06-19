class IfcBoiler extends IfcEnergyConversionDevice {
    constructor() {
        /** @type {IFCBOILERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBoilerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBoilerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCBOILERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
