package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFlowInstrumentType extends IfcDistributionControlElementType {

    public IfcFlowInstrumentTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcFlowInstrumentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFlowInstrumentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcFlowInstrumentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFlowInstrumentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
