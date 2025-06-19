class IfcLightSourcePositional extends IfcLightSource {
    constructor() {
        /** @type {IFCCARTESIANPOINT} */
        this.Position = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Radius = null;
        /** @type {IFCREAL} */
        this.ConstantAttenuation = null;
        /** @type {IFCREAL} */
        this.DistanceAttenuation = null;
        /** @type {IFCREAL} */
        this.QuadricAttenuation = null;
    }

    // === EXTENDED BY ===
    // IfcLightSourceSpot
}
