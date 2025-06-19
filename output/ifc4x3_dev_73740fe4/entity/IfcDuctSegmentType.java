package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDuctSegmentType extends IfcFlowSegmentType {

    public IfcDuctSegmentTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDuctSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDuctSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
