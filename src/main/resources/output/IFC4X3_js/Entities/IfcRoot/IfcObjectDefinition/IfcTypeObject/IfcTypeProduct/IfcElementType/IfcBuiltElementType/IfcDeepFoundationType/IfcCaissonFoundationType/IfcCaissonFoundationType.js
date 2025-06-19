class IfcCaissonFoundationType extends IfcDeepFoundationType {
    constructor() {
        /** @type {IFCCAISSONFOUNDATIONTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCaissonFoundationTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCaissonFoundationTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
