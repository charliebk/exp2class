package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElectricFlowStorageDeviceType extends IfcFlowStorageDeviceType {

    public IfcElectricFlowStorageDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
