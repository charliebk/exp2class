class IfcResource extends IfcObject {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCTEXT} */
        this.LongDescription = null;
    }

    // === EXTENDED BY ===
    // IfcConstructionResource

    // === INVERSE CLAUSES ===
    // ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
}
