package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcActuatorType extends IfcDistributionControlElementType {

    public IfcActuatorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcActuatorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcActuatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcActuatorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcActuatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
