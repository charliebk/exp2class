class IfcTypeResource extends IfcTypeObject {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCTEXT} */
        this.LongDescription = null;
        /** @type {IFCLABEL} */
        this.ResourceType = null;
    }

    // === EXTENDED BY ===
    // IfcConstructionResourceType

    // === INVERSE CLAUSES ===
    // ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
}
