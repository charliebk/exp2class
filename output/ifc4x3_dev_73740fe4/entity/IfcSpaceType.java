package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSpaceType extends IfcSpatialStructureElementType {

    public IfcSpaceTypeEnum PredefinedType;
    public IfcLabel LongName; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType));
}
