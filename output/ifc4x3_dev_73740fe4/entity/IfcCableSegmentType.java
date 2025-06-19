package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCableSegmentType extends IfcFlowSegmentType {

    public IfcCableSegmentTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCableSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCableSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCableSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCableSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
