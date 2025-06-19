class IfcClassification extends IfcExternalInformation {
    constructor() {
        /** @type {IFCLABEL} */
        this.Source = null;
        /** @type {IFCLABEL} */
        this.Edition = null;
        /** @type {IFCDATE} */
        this.EditionDate = null;
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCURIREFERENCE} */
        this.Specification = null;
        /** @type {IFCIDENTIFIER[]} */
        this.ReferenceTokens = null;
    }

    // === INVERSE CLAUSES ===
    // ClassificationForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
}
