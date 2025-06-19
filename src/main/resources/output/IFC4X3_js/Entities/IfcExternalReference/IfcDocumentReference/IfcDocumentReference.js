class IfcDocumentReference extends IfcExternalReference {
    constructor() {
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCDOCUMENTINFORMATION} */
        this.ReferencedDocument = null;
    }

    // === INVERSE CLAUSES ===
    // DocumentRefForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument

    // === WHERE CLAUSES ===
    // WR1 : EXISTS(Name) XOR EXISTS(ReferencedDocument)
}
