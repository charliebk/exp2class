package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStructuralSurfaceMember extends IfcStructuralMember {

    public IfcStructuralSurfaceMemberTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure Thickness; // OPTIONAL
    // INVERSE attributes:
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);

    // SUPERTYPE OF:
    // - IfcStructuralSurfaceMemberVarying SUBTYPE OF IfcStructuralMember

    // WHERE constraints:
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
}
