class IfcCartesianPoint extends IfcPoint {
    constructor() {
        /** @type {IFCLENGTHMEASURE[]} */
        this.Coordinates = null;
    }

    // === WHERE CLAUSES ===
    // CP2Dor3D : HIINDEX(Coordinates) >= 2
}
