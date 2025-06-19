package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTankType extends IfcFlowStorageDeviceType {

    public IfcTankTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTankTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTankTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTankTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTankTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
