class IfcTriangulatedFaceSet extends IfcTessellatedFaceSet {
    constructor() {
        /** @type {IFCPARAMETERVALUE[][]} */
        this.Normals = null;
        /** @type {IFCBOOLEAN} */
        this.Closed = null;
        /** @type {IFCPOSITIVEINTEGER[][]} */
        this.CoordIndex = null;
        /** @type {IFCPOSITIVEINTEGER[]} */
        this.PnIndex = null;
    }

    // === EXTENDED BY ===
    // IfcTriangulatedIrregularNetwork

    // === DERIVE CLAUSES ===
    // NumberOfTriangles : IfcInteger := SIZEOF(CoordIndex)
}
