package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFilterType extends IfcFlowTreatmentDeviceType {

    public IfcFilterTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcFilterTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFilterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcFilterTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFilterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
