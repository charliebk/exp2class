package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcEarthworksFill extends IfcEarthworksElement {

    public IfcEarthworksFillTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcEarthworksFillTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEarthworksFillTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcEarthworksFillTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEarthworksFillTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
