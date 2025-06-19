class IfcElementAssemblyType extends IfcElementType {
    constructor() {
        /** @type {IFCELEMENTASSEMBLYTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
