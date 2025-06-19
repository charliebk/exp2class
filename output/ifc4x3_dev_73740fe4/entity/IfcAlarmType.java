package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAlarmType extends IfcDistributionControlElementType {

    public IfcAlarmTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcAlarmTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAlarmTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcAlarmTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAlarmTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
