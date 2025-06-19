public class IfcProduct extends IfcObject {
    public IfcObjectPlacement ObjectPlacement;
    public IfcProductRepresentation Representation;

    // === EXTENDED BY ===
    // IfcAnnotation
    // IfcElement
    // IfcLinearElement
    // IfcPort
    // IfcPositioningElement
    // IfcSpatialElement
    // IfcStructuralActivity
    // IfcStructuralItem

    // === INVERSE CLAUSES ===
    // ReferencedBy : SET [0:?] OF IfcRelAssignsToProduct FOR RelatingProduct
    // PositionedRelativeTo : SET [0:?] OF IfcRelPositions FOR RelatedProducts
    // ReferencedInStructures : SET [0:?] OF IfcRelReferencedInSpatialStructure FOR RelatedElements

    // === WHERE CLAUSES ===
    // PlacementForShapeRepresentation : (EXISTS(Representation) AND EXISTS(ObjectPlacement)) OR (EXISTS(Representation) AND (SIZEOF(QUERY(temp <* Representation.Representations | 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION' IN TYPEOF(temp))) = 0)) OR (NOT(EXISTS(Representation)))
}
