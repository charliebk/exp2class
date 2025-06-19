package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcVoidingFeature extends IfcFeatureElementSubtraction {

    public IfcVoidingFeatureTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcVoidingFeatureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVoidingFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcVoidingFeatureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVoidingFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
