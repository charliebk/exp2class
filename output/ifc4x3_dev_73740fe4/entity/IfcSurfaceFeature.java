package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSurfaceFeature extends IfcFeatureElement {

    public IfcSurfaceFeatureTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // AdheresToElement : IfcRelAdheresToElement FOR RelatedSurfaceFeatures;
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSurfaceFeatureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSurfaceFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSurfaceFeatureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSurfaceFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
