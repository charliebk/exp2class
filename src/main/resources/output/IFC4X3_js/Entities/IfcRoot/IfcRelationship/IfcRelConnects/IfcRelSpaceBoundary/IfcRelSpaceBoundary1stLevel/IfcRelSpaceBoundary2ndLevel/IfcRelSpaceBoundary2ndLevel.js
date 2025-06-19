class IfcRelSpaceBoundary2ndLevel extends IfcRelSpaceBoundary1stLevel {
    constructor() {
        /** @type {IFCRELSPACEBOUNDARY2NDLEVEL} */
        this.CorrespondingBoundary = null;
    }

    // === INVERSE CLAUSES ===
    // Corresponds : SET [0:1] OF IfcRelSpaceBoundary2ndLevel FOR CorrespondingBoundary
}
