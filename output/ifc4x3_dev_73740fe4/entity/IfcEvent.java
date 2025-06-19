package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcEvent extends IfcProcess {

    public IfcEventTypeEnum PredefinedType; // OPTIONAL
    public IfcEventTriggerTypeEnum EventTriggerType; // OPTIONAL
    public IfcLabel UserDefinedEventTriggerType; // OPTIONAL
    public IfcEventTime EventOccurenceTime; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : NOT(EXISTS(EventTriggerType)) OR (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : NOT(EXISTS(EventTriggerType)) OR (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType));
}
