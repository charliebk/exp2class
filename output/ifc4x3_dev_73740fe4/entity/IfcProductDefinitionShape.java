package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcProductDefinitionShape extends IfcProductRepresentation {

    // INVERSE attributes:
    // ShapeOfProduct : SET [1:?] OF IfcProduct FOR Representation;
    // HasShapeAspects : SET [0:?] OF IfcShapeAspect FOR PartOfProductDefinitionShape;
    // INVERSE attributes:
    // OnlyShapeModel : SIZEOF(QUERY(temp <* Representations |
    // (NOT('IFC4X3_DEV_73740fe4.IFCSHAPEMODEL' IN TYPEOF(temp)))
    // )) = 0;

    // WHERE constraints:
    // OnlyShapeModel : SIZEOF(QUERY(temp <* Representations |
    // (NOT('IFC4X3_DEV_73740fe4.IFCSHAPEMODEL' IN TYPEOF(temp)))
    // )) = 0;
}
