package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCableCarrierSegmentType extends IfcFlowSegmentType {

    public IfcCableCarrierSegmentTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCableCarrierSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCableCarrierSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCableCarrierSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCableCarrierSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
