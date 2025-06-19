package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCaissonFoundationType extends IfcDeepFoundationType {

    public IfcCaissonFoundationTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCaissonFoundationTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCaissonFoundationTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCaissonFoundationTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCaissonFoundationTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
