package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcProduct extends IfcObject {

    public IfcObjectPlacement ObjectPlacement; // OPTIONAL
    public IfcProductRepresentation Representation; // OPTIONAL
    // INVERSE attributes:
    // ReferencedBy : SET [0:?] OF IfcRelAssignsToProduct FOR RelatingProduct;
    // PositionedRelativeTo : SET [0:?] OF IfcRelPositions FOR RelatedProducts;
    // ReferencedInStructures : SET [0:?] OF IfcRelReferencedInSpatialStructure FOR RelatedElements;
    // INVERSE attributes:
    // PlacementForShapeRepresentation : (EXISTS(Representation) AND EXISTS(ObjectPlacement))
    // OR (EXISTS(Representation) AND
    // (SIZEOF(QUERY(temp <* Representation.Representations | 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION' IN TYPEOF(temp))) = 0))
    // OR (NOT(EXISTS(Representation)));

    // SUPERTYPE OF:
    // - IfcAnnotation
    // - IfcElement
    // - IfcLinearElement
    // - IfcPort
    // - IfcPositioningElement
    // - IfcSpatialElement
    // - IfcStructuralActivity
    // - IfcStructuralItem SUBTYPE OF IfcObject

    // WHERE constraints:
    // PlacementForShapeRepresentation : (EXISTS(Representation) AND EXISTS(ObjectPlacement))
    // OR (EXISTS(Representation) AND
    // (SIZEOF(QUERY(temp <* Representation.Representations | 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION' IN TYPEOF(temp))) = 0))
    // OR (NOT(EXISTS(Representation)));
}
