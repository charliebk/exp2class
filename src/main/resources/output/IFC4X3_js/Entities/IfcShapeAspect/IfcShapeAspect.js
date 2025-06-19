class IfcShapeAspect {
    constructor() {
        /** @type {IFCSHAPEMODEL[]} */
        this.ShapeRepresentations = null;
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCLOGICAL} */
        this.ProductDefinitional = null;
        /** @type {IFCPRODUCTREPRESENTATIONSELECT} */
        this.PartOfProductDefinitionShape = null;
    }

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
