package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTendonAnchorType extends IfcReinforcingElementType {

    public IfcTendonAnchorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTendonAnchorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonAnchorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTendonAnchorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonAnchorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
