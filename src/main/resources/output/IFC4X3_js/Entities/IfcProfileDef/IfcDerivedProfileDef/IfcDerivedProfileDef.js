class IfcDerivedProfileDef extends IfcProfileDef {
    constructor() {
        /** @type {IFCPROFILEDEF} */
        this.ParentProfile = null;
        /** @type {IFCCARTESIANTRANSFORMATIONOPERATOR2D} */
        this.Operator = null;
        /** @type {IFCLABEL} */
        this.Label = null;
    }

    // === EXTENDED BY ===
    // IfcMirroredProfileDef

    // === WHERE CLAUSES ===
    // InvariantProfileType : SELF\IfcProfileDef.ProfileType = ParentProfile.ProfileType
}
