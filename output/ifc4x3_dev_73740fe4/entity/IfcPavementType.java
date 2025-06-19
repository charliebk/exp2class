package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPavementType extends IfcBuiltElementType {

    public IfcPavementTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcPavementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPavementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcPavementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPavementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
