package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElectricDistributionBoardType extends IfcFlowControllerType {

    public IfcElectricDistributionBoardTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricDistributionBoardTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricDistributionBoardTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
