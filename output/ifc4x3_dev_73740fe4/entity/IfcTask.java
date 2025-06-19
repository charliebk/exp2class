package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTask extends IfcProcess {

    public IfcLabel Status; // OPTIONAL
    public IfcLabel WorkMethod; // OPTIONAL
    public IfcBoolean IsMilestone;
    public IfcInteger Priority; // OPTIONAL
    public IfcTaskTime TaskTime; // OPTIONAL
    public IfcTaskTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
    // HasName : EXISTS(SELF\IfcRoot.Name);

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType));
    // HasName : EXISTS(SELF\IfcRoot.Name);
}
