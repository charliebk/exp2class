class IfcVirtualElement extends IfcElement {
    constructor() {
        /** @type {IFCVIRTUALELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVirtualElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVirtualElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
