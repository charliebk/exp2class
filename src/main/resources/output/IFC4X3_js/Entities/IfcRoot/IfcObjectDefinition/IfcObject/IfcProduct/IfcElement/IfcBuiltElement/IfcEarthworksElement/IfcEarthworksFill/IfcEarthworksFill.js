class IfcEarthworksFill extends IfcEarthworksElement {
    constructor() {
        /** @type {IFCEARTHWORKSFILLTYPEENUM} */
        this.PredefinedType = null;
    }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEarthworksFillTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEarthworksFillTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
