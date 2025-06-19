package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcConstructionMaterialResource extends IfcConstructionResource {

    public IfcConstructionMaterialResourceTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
