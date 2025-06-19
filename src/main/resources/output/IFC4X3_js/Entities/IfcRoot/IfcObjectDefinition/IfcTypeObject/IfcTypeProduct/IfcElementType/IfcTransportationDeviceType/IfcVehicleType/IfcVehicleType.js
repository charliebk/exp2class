class IfcVehicleType extends IfcTransportationDeviceType {
    constructor() {
        /** @type {IFCVEHICLETYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcVehicleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVehicleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
