package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSpaceHeaterType extends IfcFlowTerminalType {

    public IfcSpaceHeaterTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceHeaterTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpaceHeaterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceHeaterTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpaceHeaterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
