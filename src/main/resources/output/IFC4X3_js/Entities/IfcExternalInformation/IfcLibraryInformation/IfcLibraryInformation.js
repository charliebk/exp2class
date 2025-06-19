class IfcLibraryInformation extends IfcExternalInformation {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCLABEL} */
        this.Version = null;
        /** @type {IFCACTORSELECT} */
        this.Publisher = null;
        /** @type {IFCDATETIME} */
        this.VersionDate = null;
        /** @type {IFCURIREFERENCE} */
        this.Location = null;
        /** @type {IFCTEXT} */
        this.Description = null;
    }

    // === INVERSE CLAUSES ===
    // LibraryInfoForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
    // HasLibraryReferences : SET [0:?] OF IfcLibraryReference FOR ReferencedLibrary
}
