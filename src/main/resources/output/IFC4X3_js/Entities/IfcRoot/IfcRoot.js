class IfcRoot {
    constructor() {
        /** @type {IFCGLOBALLYUNIQUEID} */
        this.GlobalId = null;
        /** @type {IFCOWNERHISTORY} */
        this.OwnerHistory = null;
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
    }

    // === EXTENDED BY ===
    // IfcObjectDefinition
    // IfcPropertyDefinition
    // IfcRelationship

    // === UNIQUE CLAUSES ===
    // UR1 : GlobalId
}
