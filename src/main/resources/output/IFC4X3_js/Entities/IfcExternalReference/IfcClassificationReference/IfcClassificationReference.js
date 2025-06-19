class IfcClassificationReference extends IfcExternalReference {
    constructor() {
        /** @type {IFCCLASSIFICATIONREFERENCESELECT} */
        this.ReferencedSource = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCIDENTIFIER} */
        this.Sort = null;
    }

    // === INVERSE CLAUSES ===
    // ClassificationRefForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
}
