package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcRepresentationContext {

    public IfcLabel ContextIdentifier; // OPTIONAL
    public IfcLabel ContextType; // OPTIONAL
    // INVERSE attributes:
    // RepresentationsInContext : SET [0:?] OF IfcRepresentation FOR ContextOfItems;

    // SUPERTYPE OF:
    // - IfcGeometricRepresentationContext
}
