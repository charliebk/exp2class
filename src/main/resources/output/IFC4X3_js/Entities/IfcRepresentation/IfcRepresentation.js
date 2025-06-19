class IfcRepresentation {
    constructor() {
        /** @type {IFCREPRESENTATIONCONTEXT} */
        this.ContextOfItems = null;
        /** @type {IFCLABEL} */
        this.RepresentationIdentifier = null;
        /** @type {IFCLABEL} */
        this.RepresentationType = null;
        /** @type {SET [1:?] OF IFCREPRESENTATIONITEM} */
        this.Items = null;
    }

    // === EXTENDED BY ===
    // IfcShapeModel
    // IfcStyleModel

    // === INVERSE CLAUSES ===
    // RepresentationMap : SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation
    // LayerAssignments : SET [0:?] OF IfcPresentationLayerAssignment FOR AssignedItems
    // OfProductRepresentation : SET [0:?] OF IfcProductRepresentation FOR Representations
}
