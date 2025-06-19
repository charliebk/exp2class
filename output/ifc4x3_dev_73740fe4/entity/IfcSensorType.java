package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSensorType extends IfcDistributionControlElementType {

    public IfcSensorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSensorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSensorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSensorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSensorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
