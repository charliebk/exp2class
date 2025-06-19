package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcVehicleType extends IfcTransportationDeviceType {

    public IfcVehicleTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcVehicleTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVehicleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcVehicleTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVehicleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
