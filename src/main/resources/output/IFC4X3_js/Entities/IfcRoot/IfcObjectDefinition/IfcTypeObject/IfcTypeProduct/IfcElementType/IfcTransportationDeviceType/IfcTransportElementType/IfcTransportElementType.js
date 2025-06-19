class IfcTransportElementType extends IfcTransportationDeviceType {
    constructor() {
        /** @type {IFCTRANSPORTELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTransportElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTransportElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
