package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDuctFittingType extends IfcFlowFittingType {

    public IfcDuctFittingTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDuctFittingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDuctFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDuctFittingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDuctFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
