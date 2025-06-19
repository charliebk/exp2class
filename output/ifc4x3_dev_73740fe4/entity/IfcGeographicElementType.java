package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcGeographicElementType extends IfcElementType {

    public IfcGeographicElementTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcGeographicElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcGeographicElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcGeographicElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcGeographicElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
