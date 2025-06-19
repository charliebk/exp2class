package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcConstraint {

    public IfcLabel Name;
    public IfcText Description; // OPTIONAL
    public IfcConstraintEnum ConstraintGrade;
    public IfcLabel ConstraintSource; // OPTIONAL
    public IfcActorSelect CreatingActor; // OPTIONAL
    public IfcDateTime CreationTime; // OPTIONAL
    public IfcLabel UserDefinedGrade; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;
    // PropertiesForConstraint : SET [0:?] OF IfcResourceConstraintRelationship FOR RelatingConstraint;
    // INVERSE attributes:
    // WR11 : (ConstraintGrade <> IfcConstraintEnum.USERDEFINED) OR
    // ((ConstraintGrade = IfcConstraintEnum.USERDEFINED) AND EXISTS(SELF\IfcConstraint.UserDefinedGrade));

    // SUPERTYPE OF:
    // - IfcMetric
    // - IfcObjective

    // WHERE constraints:
    // WR11 : (ConstraintGrade <> IfcConstraintEnum.USERDEFINED) OR
    // ((ConstraintGrade = IfcConstraintEnum.USERDEFINED) AND EXISTS(SELF\IfcConstraint.UserDefinedGrade));
}
