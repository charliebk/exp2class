class IfcMaterialLayerWithOffsets extends IfcMaterialLayer {
    constructor() {
        /** @type {IFCLAYERSETDIRECTIONENUM} */
        this.OffsetDirection = null;
        /** @type {ARRAY [1:2] OF IFCLENGTHMEASURE} */
        this.OffsetValues = null;
    }
}
