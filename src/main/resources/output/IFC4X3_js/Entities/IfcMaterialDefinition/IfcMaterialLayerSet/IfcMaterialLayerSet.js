class IfcMaterialLayerSet extends IfcMaterialDefinition {
    constructor() {
        /** @type {IFCMATERIALLAYER[]} */
        this.MaterialLayers = null;
        /** @type {IFCLABEL} */
        this.LayerSetName = null;
        /** @type {IFCTEXT} */
        this.Description = null;
    }

    // === DERIVE CLAUSES ===
    // TotalThickness : IfcLengthMeasure := IfcMlsTotalThickness(SELF)
}
