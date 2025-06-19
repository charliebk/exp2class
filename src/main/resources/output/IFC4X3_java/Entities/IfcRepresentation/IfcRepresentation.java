public class IfcRepresentation {
    public IfcRepresentationContext ContextOfItems;
    public IfcLabel RepresentationIdentifier;
    public IfcLabel RepresentationType;
    public SET [1:?] OF IfcRepresentationItem Items;

    // === EXTENDED BY ===
    // IfcShapeModel
    // IfcStyleModel

    // === INVERSE CLAUSES ===
    // RepresentationMap : SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation
    // LayerAssignments : SET [0:?] OF IfcPresentationLayerAssignment FOR AssignedItems
    // OfProductRepresentation : SET [0:?] OF IfcProductRepresentation FOR Representations
}
