package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWorkPlan extends IfcWorkControl {

    public IfcWorkPlanTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkPlanTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWorkPlanTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkPlanTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWorkPlanTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
}
