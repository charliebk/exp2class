package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDistributionBoardType extends IfcFlowControllerType {

    public IfcDistributionBoardTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionBoardTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionBoardTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
