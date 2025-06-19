package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTrackElementType extends IfcBuiltElementType {

    public IfcTrackElementTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTrackElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTrackElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTrackElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTrackElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
