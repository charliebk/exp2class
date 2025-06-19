class IfcMaterialProfileSetUsage extends IfcMaterialUsageDefinition {
    constructor() {
        /** @type {IFCMATERIALPROFILESET} */
        this.ForProfileSet = null;
        /** @type {IFCCARDINALPOINTREFERENCE} */
        this.CardinalPoint = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.ReferenceExtent = null;
    }

    // === EXTENDED BY ===
    // IfcMaterialProfileSetUsageTapering
}
