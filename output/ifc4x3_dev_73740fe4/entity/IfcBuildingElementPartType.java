package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBuildingElementPartType extends IfcElementComponentType {

    public IfcBuildingElementPartTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementPartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingElementPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementPartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingElementPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
