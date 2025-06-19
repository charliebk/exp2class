class IfcDoorType extends IfcBuiltElementType {
    constructor() {
        /** @type {IFCDOORTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCDOORTYPEOPERATIONENUM} */
        this.OperationType = null;
        /** @type {IFCBOOLEAN} */
        this.ParameterTakesPrecedence = null;
        /** @type {IFCLABEL} */
        this.UserDefinedOperationType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
