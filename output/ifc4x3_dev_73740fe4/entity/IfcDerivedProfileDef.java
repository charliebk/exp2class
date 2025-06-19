package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDerivedProfileDef extends IfcProfileDef {

    public IfcProfileDef ParentProfile;
    public IfcCartesianTransformationOperator2D Operator;
    public IfcLabel Label; // OPTIONAL
    // INVERSE attributes:
    // InvariantProfileType : SELF\IfcProfileDef.ProfileType = ParentProfile.ProfileType;

    // SUPERTYPE OF:
    // - IfcMirroredProfileDef SUBTYPE OF IfcProfileDef

    // WHERE constraints:
    // InvariantProfileType : SELF\IfcProfileDef.ProfileType = ParentProfile.ProfileType;
}
