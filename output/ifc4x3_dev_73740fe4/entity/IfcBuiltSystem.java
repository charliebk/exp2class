package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBuiltSystem extends IfcSystem {

    public IfcBuiltSystemTypeEnum PredefinedType; // OPTIONAL
    public IfcLabel LongName; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBuiltSystemTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuiltSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBuiltSystemTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuiltSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
