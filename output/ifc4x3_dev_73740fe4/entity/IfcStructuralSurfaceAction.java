package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStructuralSurfaceAction extends IfcStructuralAction {

    public IfcProjectedOrTrueLengthEnum ProjectedOrTrue; // OPTIONAL
    public IfcStructuralSurfaceActivityTypeEnum PredefinedType;
    // INVERSE attributes:
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR
    // ((ProjectedOrTrue <> PROJECTED_LENGTH) OR
    // (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS));

    // SUPERTYPE OF:
    // - IfcStructuralPlanarAction SUBTYPE OF IfcStructuralAction

    // WHERE constraints:
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType);
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR
    // ((ProjectedOrTrue <> PROJECTED_LENGTH) OR
    // (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS));
}
