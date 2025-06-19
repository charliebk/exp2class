class IfcConnectionPointGeometry extends IfcConnectionGeometry {
    constructor() {
        /** @type {IFCPOINTORVERTEXPOINT} */
        this.PointOnRelatingElement = null;
        /** @type {IFCPOINTORVERTEXPOINT} */
        this.PointOnRelatedElement = null;
    }

    // === EXTENDED BY ===
    // IfcConnectionPointEccentricity
}
