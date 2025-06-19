class IfcInterceptor extends IfcFlowTreatmentDevice {
    constructor() {
        /** @type {IFCINTERCEPTORTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcInterceptorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcInterceptorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCINTERCEPTORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
