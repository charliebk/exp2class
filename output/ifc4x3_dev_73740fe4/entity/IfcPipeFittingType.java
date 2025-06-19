package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPipeFittingType extends IfcFlowFittingType {

    public IfcPipeFittingTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcPipeFittingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPipeFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcPipeFittingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPipeFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
