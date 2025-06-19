package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElementAssemblyType extends IfcElementType {

    public IfcElementAssemblyTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
