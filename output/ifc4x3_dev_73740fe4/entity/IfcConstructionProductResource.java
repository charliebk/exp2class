package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcConstructionProductResource extends IfcConstructionResource {

    public IfcConstructionProductResourceTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
