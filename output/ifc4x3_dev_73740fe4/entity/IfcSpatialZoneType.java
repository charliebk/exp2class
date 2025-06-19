package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSpatialZoneType extends IfcSpatialElementType {

    public IfcSpatialZoneTypeEnum PredefinedType;
    public IfcLabel LongName; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType));
}
