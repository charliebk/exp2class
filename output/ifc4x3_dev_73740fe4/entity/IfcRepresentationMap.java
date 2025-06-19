package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcRepresentationMap {

    public IfcAxis2Placement MappingOrigin;
    public IfcRepresentation MappedRepresentation;
    // INVERSE attributes:
    // HasShapeAspects : SET [0:?] OF IfcShapeAspect FOR PartOfProductDefinitionShape;
    // MapUsage : SET [0:?] OF IfcMappedItem FOR MappingSource;
    // INVERSE attributes:
    // ApplicableMappedRepr : 'IFC4X3_DEV_73740fe4.IFCSHAPEMODEL' IN TYPEOF(MappedRepresentation);

    // WHERE constraints:
    // ApplicableMappedRepr : 'IFC4X3_DEV_73740fe4.IFCSHAPEMODEL' IN TYPEOF(MappedRepresentation);
}
