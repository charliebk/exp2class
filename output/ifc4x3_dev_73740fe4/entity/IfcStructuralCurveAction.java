package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStructuralCurveAction extends IfcStructuralAction {

    public IfcProjectedOrTrueLengthEnum ProjectedOrTrue; // OPTIONAL
    public IfcStructuralCurveActivityTypeEnum PredefinedType;
    // INVERSE attributes:
    // HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR
    // ((ProjectedOrTrue <> PROJECTED_LENGTH) OR
    // (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS));
    // SuitablePredefinedType : PredefinedType <> IfcStructuralCurveActivityTypeEnum.EQUIDISTANT;

    // SUPERTYPE OF:
    // - IfcStructuralLinearAction SUBTYPE OF IfcStructuralAction

    // WHERE constraints:
    // HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR
    // ((ProjectedOrTrue <> PROJECTED_LENGTH) OR
    // (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS));
    // SuitablePredefinedType : PredefinedType <> IfcStructuralCurveActivityTypeEnum.EQUIDISTANT;
}
