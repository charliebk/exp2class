package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcProcedure extends IfcProcess {

    public IfcProcedureTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
    // HasName : EXISTS(SELF\IfcRoot.Name);

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
    // HasName : EXISTS(SELF\IfcRoot.Name);
}
