package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFanType extends IfcFlowMovingDeviceType {

    public IfcFanTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcFanTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFanTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcFanTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFanTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
