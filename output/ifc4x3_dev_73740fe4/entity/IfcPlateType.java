package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPlateType extends IfcBuiltElementType {

    public IfcPlateTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcPlateTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPlateTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcPlateTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPlateTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
