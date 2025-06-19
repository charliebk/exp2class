package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTransportElementType extends IfcTransportationDeviceType {

    public IfcTransportElementTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTransportElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTransportElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTransportElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTransportElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
