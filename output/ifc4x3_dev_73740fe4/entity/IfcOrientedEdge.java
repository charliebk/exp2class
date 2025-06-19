package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcOrientedEdge extends IfcEdge {

    public IfcEdge EdgeElement;
    public IfcBoolean Orientation;
    // INVERSE attributes:
    // SELF\IfcEdge.EdgeStart : IfcVertex := IfcBooleanChoose
    // (Orientation, EdgeElement.EdgeStart, EdgeElement.EdgeEnd);
    // SELF\IfcEdge.EdgeEnd : IfcVertex := IfcBooleanChoose
    // (Orientation, EdgeElement.EdgeEnd, EdgeElement.EdgeStart);
    // INVERSE attributes:
    // EdgeElementNotOriented : NOT('IFC4X3_DEV_73740fe4.IFCORIENTEDEDGE' IN TYPEOF(EdgeElement));

    // WHERE constraints:
    // EdgeElementNotOriented : NOT('IFC4X3_DEV_73740fe4.IFCORIENTEDEDGE' IN TYPEOF(EdgeElement));
}
