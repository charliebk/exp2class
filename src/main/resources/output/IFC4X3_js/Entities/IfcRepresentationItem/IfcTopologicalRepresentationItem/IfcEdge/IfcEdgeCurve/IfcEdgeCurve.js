class IfcEdgeCurve extends IfcEdge {
    constructor() {
        /** @type {IFCCURVE} */
        this.EdgeGeometry = null;
        /** @type {IFCBOOLEAN} */
        this.SameSense = null;
    }
}
