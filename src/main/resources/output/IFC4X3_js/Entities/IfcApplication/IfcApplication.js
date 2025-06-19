class IfcApplication {
    constructor() {
        /** @type {IFCORGANIZATION} */
        this.ApplicationDeveloper = null;
        /** @type {IFCLABEL} */
        this.Version = null;
        /** @type {IFCLABEL} */
        this.ApplicationFullName = null;
        /** @type {IFCIDENTIFIER} */
        this.ApplicationIdentifier = null;
    }

    // === UNIQUE CLAUSES ===
    // UR1 : ApplicationIdentifier
    // UR2 : ApplicationFullName, Version
}
