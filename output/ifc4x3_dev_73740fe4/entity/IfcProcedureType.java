package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcProcedureType extends IfcTypeProcess {

    public IfcProcedureTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType));
}
