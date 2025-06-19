package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcEdgeLoop extends IfcLoop {

    // INVERSE attributes:
    // Ne : IfcInteger := SIZEOF(EdgeList);
    // INVERSE attributes:
    // IsClosed : (EdgeList[1].EdgeStart) :=: (EdgeList[Ne].EdgeEnd);
    // IsContinuous : IfcLoopHeadToTail(SELF);

    // WHERE constraints:
    // IsClosed : (EdgeList[1].EdgeStart) :=: (EdgeList[Ne].EdgeEnd);
    // IsContinuous : IfcLoopHeadToTail(SELF);
}
