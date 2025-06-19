package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcUnitaryControlElementType extends IfcDistributionControlElementType {

    public IfcUnitaryControlElementTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryControlElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcUnitaryControlElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryControlElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcUnitaryControlElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
