package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcStructuralResultGroup extends IfcGroup {

    public IfcAnalysisTheoryTypeEnum TheoryType;
    public IfcStructuralLoadGroup ResultForLoadGroup; // OPTIONAL
    public IfcBoolean IsLinear;
    // INVERSE attributes:
    // ResultGroupFor : SET [0:1] OF IfcStructuralAnalysisModel FOR HasResults;
    // INVERSE attributes:
    // HasObjectType : (TheoryType <> IfcAnalysisTheoryTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);

    // WHERE constraints:
    // HasObjectType : (TheoryType <> IfcAnalysisTheoryTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
}
