class IfcMechanicalFastenerType extends IfcElementComponentType {
    constructor() {
        /** @type {IFCMECHANICALFASTENERTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalDiameter = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalLength = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
