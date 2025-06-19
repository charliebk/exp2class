class IfcGeographicElementType extends IfcElementType {
    constructor() {
        /** @type {IFCGEOGRAPHICELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcGeographicElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeographicElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
