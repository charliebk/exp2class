class IfcActor extends IfcObject {
    constructor() {
        /** @type {IFCACTORSELECT} */
        this.TheActor = null;
    }

    // === EXTENDED BY ===
    // IfcOccupant

    // === INVERSE CLAUSES ===
    // IsActingUpon : SET [0:?] OF IfcRelAssignsToActor FOR RelatingActor
}
