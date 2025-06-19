package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcLaborResource extends IfcConstructionResource {

    public IfcLaborResourceTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
