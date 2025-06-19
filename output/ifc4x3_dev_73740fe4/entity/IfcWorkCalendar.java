package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcWorkCalendar extends IfcControl {

    public IfcWorkCalendarTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkCalendarTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWorkCalendarTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkCalendarTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWorkCalendarTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
}
