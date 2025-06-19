class IfcEdgeLoop extends IfcLoop {
    constructor() {
        /** @type {IFCORIENTEDEDGE[]} */
        this.EdgeList = null;
    }

    // === WHERE CLAUSES ===
    // IsClosed : (EdgeList[1].EdgeStart) :=: (EdgeList[Ne].EdgeEnd)
    // IsContinuous : IfcLoopHeadToTail(SELF)

    // === DERIVE CLAUSES ===
    // Ne : IfcInteger := SIZEOF(EdgeList)
}
