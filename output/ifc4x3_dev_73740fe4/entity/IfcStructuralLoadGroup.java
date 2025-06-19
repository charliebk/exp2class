package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcStructuralLoadGroup extends IfcGroup {

    public IfcLoadGroupTypeEnum PredefinedType;
    public IfcActionTypeEnum ActionType;
    public IfcActionSourceTypeEnum ActionSource;
    public IfcRatioMeasure Coefficient; // OPTIONAL
    public IfcLabel Purpose; // OPTIONAL
    // INVERSE attributes:
    // SourceOfResultGroup : SET [0:1] OF IfcStructuralResultGroup FOR ResultForLoadGroup;
    // LoadGroupFor : SET [0:?] OF IfcStructuralAnalysisModel FOR LoadedBy;
    // INVERSE attributes:
    // HasObjectType : (
    // (PredefinedType <> IfcLoadGroupTypeEnum.USERDEFINED) AND
    // (ActionType <> IfcActionTypeEnum.USERDEFINED) AND
    // (ActionSource <> IfcActionSourceTypeEnum.USERDEFINED)
    // ) OR EXISTS(SELF\IfcObject.ObjectType);

    // SUPERTYPE OF:
    // - IfcStructuralLoadCase SUBTYPE OF IfcGroup

    // WHERE constraints:
    // HasObjectType : (
    // (PredefinedType <> IfcLoadGroupTypeEnum.USERDEFINED) AND
    // (ActionType <> IfcActionTypeEnum.USERDEFINED) AND
    // (ActionSource <> IfcActionSourceTypeEnum.USERDEFINED)
    // ) OR EXISTS(SELF\IfcObject.ObjectType);
}
