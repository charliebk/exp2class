class IfcPhysicalQuantity {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
    }

    // === EXTENDED BY ===
    // IfcPhysicalComplexQuantity
    // IfcPhysicalSimpleQuantity

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
    // PartOfComplex : SET [0:1] OF IfcPhysicalComplexQuantity FOR HasQuantities
}
