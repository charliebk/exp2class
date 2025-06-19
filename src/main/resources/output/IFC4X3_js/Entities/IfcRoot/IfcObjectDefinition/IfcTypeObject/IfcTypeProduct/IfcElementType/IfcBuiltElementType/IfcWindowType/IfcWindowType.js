class IfcWindowType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCWINDOWTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCWINDOWTYPEPARTITIONINGENUM} */
        this.PartitioningType = null;
        /** @type {IFCBOOLEAN} */
        this.ParameterTakesPrecedence = null;
        /** @type {IFCLABEL} */
        this.UserDefinedPartitioningType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
