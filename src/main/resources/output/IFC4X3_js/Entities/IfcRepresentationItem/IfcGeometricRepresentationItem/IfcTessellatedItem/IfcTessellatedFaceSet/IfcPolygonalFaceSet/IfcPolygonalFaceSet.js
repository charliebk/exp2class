class IfcPolygonalFaceSet extends IfcTessellatedFaceSet {
    constructor() {
        /** @type {IFCBOOLEAN} */
        this.Closed = null;
        /** @type {UNIQUE IFCINDEXEDPOLYGONALFACE[]} */
        this.Faces = null;
        /** @type {IFCPOSITIVEINTEGER[]} */
        this.PnIndex = null;
    }
}
