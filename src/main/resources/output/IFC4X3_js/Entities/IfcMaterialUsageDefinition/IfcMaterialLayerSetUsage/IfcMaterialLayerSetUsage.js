class IfcMaterialLayerSetUsage extends IfcMaterialUsageDefinition {
    constructor() {
        /** @type {IFCMATERIALLAYERSET} */
        this.ForLayerSet = null;
        /** @type {IFCLAYERSETDIRECTIONENUM} */
        this.LayerSetDirection = null;
        /** @type {IFCDIRECTIONSENSEENUM} */
        this.DirectionSense = null;
        /** @type {IFCLENGTHMEASURE} */
        this.OffsetFromReferenceLine = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.ReferenceExtent = null;
    }
}
