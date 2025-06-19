package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcTypeResource extends IfcTypeObject {

    public IfcIdentifier Identification; // OPTIONAL
    public IfcText LongDescription; // OPTIONAL
    public IfcLabel ResourceType; // OPTIONAL
    // INVERSE attributes:
    // ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource;

    // SUPERTYPE OF:
    // - IfcConstructionResourceType SUBTYPE OF IfcTypeObject
}
