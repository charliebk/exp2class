package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcNavigationElementType extends IfcBuiltElementType {

    public IfcNavigationElementTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcNavigationElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcNavigationElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcNavigationElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcNavigationElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
