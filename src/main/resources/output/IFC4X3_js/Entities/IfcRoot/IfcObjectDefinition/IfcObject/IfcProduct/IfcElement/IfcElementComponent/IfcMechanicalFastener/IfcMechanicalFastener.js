class IfcMechanicalFastener extends IfcElementComponent {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalDiameter = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalLength = null;
        /** @type {IFCMECHANICALFASTENERTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCMECHANICALFASTENERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
