package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelConnectsElements extends IfcRelConnects {

    public IfcConnectionGeometry ConnectionGeometry; // OPTIONAL
    public IfcElement RelatingElement;
    public IfcElement RelatedElement;
    // INVERSE attributes:
    // NoSelfReference : RelatingElement :<>: RelatedElement;

    // SUPERTYPE OF:
    // - IfcRelConnectsPathElements
    // - IfcRelConnectsWithRealizingElements SUBTYPE OF IfcRelConnects

    // WHERE constraints:
    // NoSelfReference : RelatingElement :<>: RelatedElement;
}
