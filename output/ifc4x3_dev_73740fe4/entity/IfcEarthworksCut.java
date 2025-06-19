package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcEarthworksCut extends IfcFeatureElementSubtraction {

    public IfcEarthworksCutTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcEarthworksCutTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEarthworksCutTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcEarthworksCutTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEarthworksCutTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
