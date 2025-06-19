package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFlowMeterType extends IfcFlowControllerType {

    public IfcFlowMeterTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcFlowMeterTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFlowMeterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcFlowMeterTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFlowMeterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
