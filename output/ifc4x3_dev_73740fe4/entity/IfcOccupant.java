package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcOccupant extends IfcActor {

    public IfcOccupantTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // WR31 : NOT(PredefinedType = IfcOccupantTypeEnum.USERDEFINED)
    // OR EXISTS(SELF\IfcObject.ObjectType);

    // WHERE constraints:
    // WR31 : NOT(PredefinedType = IfcOccupantTypeEnum.USERDEFINED)
    // OR EXISTS(SELF\IfcObject.ObjectType);
}
