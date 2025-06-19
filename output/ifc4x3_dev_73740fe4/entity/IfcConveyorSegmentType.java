package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcConveyorSegmentType extends IfcFlowSegmentType {

    public IfcConveyorSegmentTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcConveyorSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConveyorSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcConveyorSegmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConveyorSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
