package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public class IfcTypeProduct extends IfcTypeObject {

    public IfcLabel Tag; // OPTIONAL
    // INVERSE attributes:
    // ReferencedBy : SET [0:?] OF IfcRelAssignsToProduct FOR RelatingProduct;
    // INVERSE attributes:
    // ApplicableOccurrence : NOT(EXISTS(SELF\IfcTypeObject.Types[1])) OR
    // (SIZEOF(QUERY(temp <* SELF\IfcTypeObject.Types[1].RelatedObjects |
    // NOT('IFC4X3_DEV_73740fe4.IFCPRODUCT' IN TYPEOF(temp)))
    // ) = 0);

    // SUPERTYPE OF:
    // - IfcElementType
    // - IfcSpatialElementType SUBTYPE OF IfcTypeObject

    // WHERE constraints:
    // ApplicableOccurrence : NOT(EXISTS(SELF\IfcTypeObject.Types[1])) OR
    // (SIZEOF(QUERY(temp <* SELF\IfcTypeObject.Types[1].RelatedObjects |
    // NOT('IFC4X3_DEV_73740fe4.IFCPRODUCT' IN TYPEOF(temp)))
    // ) = 0);
}
