public class IfcRepresentation
{
    public IfcRepresentationContext ContextOfItems { get; set; }
    public IfcLabel RepresentationIdentifier { get; set; }
    public IfcLabel RepresentationType { get; set; }
    public SET [1:?] OF IfcRepresentationItem Items { get; set; }

    // === EXTENDED BY ===
    // IfcShapeModel
    // IfcStyleModel

    // === INVERSE CLAUSES ===
    // RepresentationMap : SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation
    // LayerAssignments : SET [0:?] OF IfcPresentationLayerAssignment FOR AssignedItems
    // OfProductRepresentation : SET [0:?] OF IfcProductRepresentation FOR Representations
}
