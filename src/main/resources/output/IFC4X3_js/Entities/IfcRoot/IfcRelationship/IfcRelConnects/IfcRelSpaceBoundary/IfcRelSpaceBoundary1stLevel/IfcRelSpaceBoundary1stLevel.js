class IfcRelSpaceBoundary1stLevel extends IfcRelSpaceBoundary {
    constructor() {
        /** @type {IFCRELSPACEBOUNDARY1STLEVEL} */
        this.ParentBoundary = null;
    }

    // === EXTENDED BY ===
    // IfcRelSpaceBoundary2ndLevel

    // === INVERSE CLAUSES ===
    // InnerBoundaries : SET [0:?] OF IfcRelSpaceBoundary1stLevel FOR ParentBoundary
}
