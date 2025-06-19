package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTubeBundleType extends IfcEnergyConversionDeviceType {

    public IfcTubeBundleTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTubeBundleTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTubeBundleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTubeBundleTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTubeBundleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
