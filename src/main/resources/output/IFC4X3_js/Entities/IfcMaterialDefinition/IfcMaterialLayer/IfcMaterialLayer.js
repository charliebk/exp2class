class IfcMaterialLayer extends IfcMaterialDefinition {
    constructor() {
        /** @type {IFCMATERIAL} */
        this.Material = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.LayerThickness = null;
        /** @type {IFCLOGICAL} */
        this.IsVentilated = null;
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCLABEL} */
        this.Category = null;
        /** @type {IFCINTEGER} */
        this.Priority = null;
    }

    // === EXTENDED BY ===
    // IfcMaterialLayerWithOffsets

    // === INVERSE CLAUSES ===
    // ToMaterialLayerSet : IfcMaterialLayerSet FOR MaterialLayers

    // === WHERE CLAUSES ===
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100}
}
