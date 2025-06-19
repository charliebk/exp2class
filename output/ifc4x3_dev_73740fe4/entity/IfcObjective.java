package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcObjective extends IfcConstraint {

    public IfcLogicalOperatorEnum LogicalAggregator; // OPTIONAL
    public IfcObjectiveEnum ObjectiveQualifier;
    public IfcLabel UserDefinedQualifier; // OPTIONAL
    // INVERSE attributes:
    // WR21 : (ObjectiveQualifier <> IfcObjectiveEnum.USERDEFINED) OR
    // ((ObjectiveQualifier = IfcObjectiveEnum.USERDEFINED) AND EXISTS(SELF\IfcObjective.UserDefinedQualifier));

    // WHERE constraints:
    // WR21 : (ObjectiveQualifier <> IfcObjectiveEnum.USERDEFINED) OR
    // ((ObjectiveQualifier = IfcObjectiveEnum.USERDEFINED) AND EXISTS(SELF\IfcObjective.UserDefinedQualifier));
}
