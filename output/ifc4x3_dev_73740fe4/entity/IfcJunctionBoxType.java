package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcJunctionBoxType extends IfcFlowFittingType {

    public IfcJunctionBoxTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcJunctionBoxTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcJunctionBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcJunctionBoxTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcJunctionBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
