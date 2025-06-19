package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCompressorType extends IfcFlowMovingDeviceType {

    public IfcCompressorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCompressorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCompressorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCompressorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCompressorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
