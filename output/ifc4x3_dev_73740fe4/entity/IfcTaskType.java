package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTaskType extends IfcTypeProcess {

    public IfcTaskTypeEnum PredefinedType;
    public IfcLabel WorkMethod; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType));
}
