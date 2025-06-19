package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTopologyRepresentation extends IfcShapeModel {

    // INVERSE attributes:
    // WR21 : SIZEOF(QUERY(temp <* SELF\IfcRepresentation.Items |
    // NOT('IFC4X3_DEV_73740fe4.IFCTOPOLOGICALREPRESENTATIONITEM' IN TYPEOF(temp))
    // )) = 0
    // ;
    // WR22 : EXISTS(SELF\IfcRepresentation.RepresentationType);
    // WR23 : IfcTopologyRepresentationTypes(SELF\IfcRepresentation.RepresentationType, SELF\IfcRepresentation.Items);

    // WHERE constraints:
    // WR21 : SIZEOF(QUERY(temp <* SELF\IfcRepresentation.Items |
    // NOT('IFC4X3_DEV_73740fe4.IFCTOPOLOGICALREPRESENTATIONITEM' IN TYPEOF(temp))
    // )) = 0
    // 
    // ;
    // WR22 : EXISTS(SELF\IfcRepresentation.RepresentationType);
    // WR23 : IfcTopologyRepresentationTypes(SELF\IfcRepresentation.RepresentationType, SELF\IfcRepresentation.Items);
}
