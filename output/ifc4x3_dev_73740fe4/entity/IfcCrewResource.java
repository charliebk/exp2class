package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCrewResource extends IfcConstructionResource {

    public IfcCrewResourceTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
