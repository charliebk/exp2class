package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcGeotechnicalStratum extends IfcGeotechnicalElement {

    public IfcGeotechnicalStratumTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcGeotechnicalStratumTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcGeotechnicalStratumTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcGeotechnicalStratumTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcGeotechnicalStratumTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
