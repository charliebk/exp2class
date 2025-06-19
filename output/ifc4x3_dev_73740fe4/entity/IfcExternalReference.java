package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcExternalReference {

    public IfcURIReference Location; // OPTIONAL
    public IfcIdentifier Identification; // OPTIONAL
    public IfcLabel Name; // OPTIONAL
    // INVERSE attributes:
    // ExternalReferenceForResources : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatingReference;
    // INVERSE attributes:
    // WR1 : EXISTS(Identification) OR EXISTS(Location) OR EXISTS(Name);

    // SUPERTYPE OF:
    // - IfcClassificationReference
    // - IfcDocumentReference
    // - IfcExternallyDefinedHatchStyle
    // - IfcExternallyDefinedSurfaceStyle
    // - IfcExternallyDefinedTextFont
    // - IfcLibraryReference

    // WHERE constraints:
    // WR1 : EXISTS(Identification) OR EXISTS(Location) OR EXISTS(Name);
}
