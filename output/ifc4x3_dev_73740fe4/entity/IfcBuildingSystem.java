package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBuildingSystem extends IfcSystem {

    public IfcBuildingSystemTypeEnum PredefinedType; // OPTIONAL
    public IfcLabel LongName; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBuildingSystemTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBuildingSystemTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBuildingSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
