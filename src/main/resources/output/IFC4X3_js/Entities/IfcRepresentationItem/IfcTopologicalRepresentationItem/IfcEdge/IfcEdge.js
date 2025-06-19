class IfcEdge extends IfcTopologicalRepresentationItem {
    constructor() {
        /** @type {IFCVERTEX} */
        this.EdgeStart = null;
        /** @type {IFCVERTEX} */
        this.EdgeEnd = null;
    }

    // === EXTENDED BY ===
    // IfcEdgeCurve
    // IfcOrientedEdge
    // IfcSubedge
}
