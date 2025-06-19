package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDistributionChamberElementType extends IfcDistributionFlowElementType {

    public IfcDistributionChamberElementTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
