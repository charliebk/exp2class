class IfcLibraryReference extends IfcExternalReference {
    constructor() {
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCLANGUAGEID} */
        this.Language = null;
        /** @type {IFCLIBRARYINFORMATION} */
        this.ReferencedLibrary = null;
    }

    // === INVERSE CLAUSES ===
    // LibraryRefForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
}
