package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcValveType extends IfcFlowControllerType {

    public IfcValveTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcValveTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcValveTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcValveTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcValveTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
