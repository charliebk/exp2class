class IfcToroidalSurface extends IfcElementarySurface {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.MajorRadius = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.MinorRadius = null;
    }

    // === WHERE CLAUSES ===
    // MajorLargerMinor : MinorRadius < MajorRadius
}
