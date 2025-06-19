package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcInterceptorType extends IfcFlowTreatmentDeviceType {

    public IfcInterceptorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcInterceptorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcInterceptorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcInterceptorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcInterceptorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
