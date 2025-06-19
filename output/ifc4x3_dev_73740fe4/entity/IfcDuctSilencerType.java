package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDuctSilencerType extends IfcFlowTreatmentDeviceType {

    public IfcDuctSilencerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSilencerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDuctSilencerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSilencerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDuctSilencerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
