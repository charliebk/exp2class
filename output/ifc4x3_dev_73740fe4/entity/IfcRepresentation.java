package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcRepresentation {

    public IfcRepresentationContext ContextOfItems;
    public IfcLabel RepresentationIdentifier; // OPTIONAL
    public IfcLabel RepresentationType; // OPTIONAL
    // INVERSE attributes:
    // RepresentationMap : SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation;
    // LayerAssignments : SET [0:?] OF IfcPresentationLayerAssignment FOR AssignedItems;
    // OfProductRepresentation : SET [0:?] OF IfcProductRepresentation FOR Representations;

    // SUPERTYPE OF:
    // - IfcShapeModel
    // - IfcStyleModel
}
