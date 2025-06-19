class IfcMaterialConstituent extends IfcMaterialDefinition {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCMATERIAL} */
        this.Material = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.Fraction = null;
        /** @type {IFCLABEL} */
        this.Category = null;
    }

    // === INVERSE CLAUSES ===
    // ToMaterialConstituentSet : IfcMaterialConstituentSet FOR MaterialConstituents
}
