package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPumpType extends IfcFlowMovingDeviceType {

    public IfcPumpTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcPumpTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPumpTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcPumpTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPumpTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
