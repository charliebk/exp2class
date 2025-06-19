package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElectricTimeControlType extends IfcFlowControllerType {

    public IfcElectricTimeControlTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricTimeControlTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricTimeControlTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricTimeControlTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricTimeControlTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
