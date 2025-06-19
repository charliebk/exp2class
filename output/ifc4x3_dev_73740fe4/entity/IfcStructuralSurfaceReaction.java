package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStructuralSurfaceReaction extends IfcStructuralReaction {

    public IfcStructuralSurfaceActivityTypeEnum PredefinedType;
    // INVERSE attributes:
    // HasPredefinedType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);

    // WHERE constraints:
    // HasPredefinedType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
}
