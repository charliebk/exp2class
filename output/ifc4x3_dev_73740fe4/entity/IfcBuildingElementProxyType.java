package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBuildingElementProxyType extends IfcBuiltElementType {

    public IfcBuildingElementProxyTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
