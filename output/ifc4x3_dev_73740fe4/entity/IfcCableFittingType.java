package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCableFittingType extends IfcFlowFittingType {

    public IfcCableFittingTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCableFittingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCableFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCableFittingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCableFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
