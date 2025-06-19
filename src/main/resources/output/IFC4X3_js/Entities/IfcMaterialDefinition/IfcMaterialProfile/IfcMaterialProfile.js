class IfcMaterialProfile extends IfcMaterialDefinition {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCMATERIAL} */
        this.Material = null;
        /** @type {IFCPROFILEDEF} */
        this.Profile = null;
        /** @type {IFCINTEGER} */
        this.Priority = null;
        /** @type {IFCLABEL} */
        this.Category = null;
    }

    // === EXTENDED BY ===
    // IfcMaterialProfileWithOffsets

    // === INVERSE CLAUSES ===
    // ToMaterialProfileSet : IfcMaterialProfileSet FOR MaterialProfiles

    // === WHERE CLAUSES ===
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
}
