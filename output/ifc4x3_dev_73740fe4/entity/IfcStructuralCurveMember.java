package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStructuralCurveMember extends IfcStructuralMember {

    public IfcStructuralCurveMemberTypeEnum PredefinedType;
    public IfcDirection Axis;
    // INVERSE attributes:
    // HasObjectType : (PredefinedType <> IfcStructuralCurveMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);

    // SUPERTYPE OF:
    // - IfcStructuralCurveMemberVarying SUBTYPE OF IfcStructuralMember

    // WHERE constraints:
    // HasObjectType : (PredefinedType <> IfcStructuralCurveMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
}
