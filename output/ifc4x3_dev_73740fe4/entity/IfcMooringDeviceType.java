package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMooringDeviceType extends IfcBuiltElementType {

    public IfcMooringDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcMooringDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMooringDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcMooringDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMooringDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
