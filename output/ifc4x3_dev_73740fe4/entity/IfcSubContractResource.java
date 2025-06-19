package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSubContractResource extends IfcConstructionResource {

    public IfcSubContractResourceTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
