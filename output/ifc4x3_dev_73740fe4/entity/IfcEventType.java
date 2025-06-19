package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcEventType extends IfcTypeProcess {

    public IfcEventTypeEnum PredefinedType;
    public IfcEventTriggerTypeEnum EventTriggerType;
    public IfcLabel UserDefinedEventTriggerType; // OPTIONAL
    // INVERSE attributes:
    // CorrectEventTriggerType : (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType)) ;
    // CorrectPredefinedType : (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType));

    // WHERE constraints:
    // CorrectEventTriggerType : (EventTriggerType <> IfcEventTriggerTypeEnum.USERDEFINED) OR ((EventTriggerType = IfcEventTriggerTypeEnum.USERDEFINED) AND EXISTS(UserDefinedEventTriggerType)) ;
    // CorrectPredefinedType : (PredefinedType <> IfcEventTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEventTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType));
}
