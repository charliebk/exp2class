public class IfcStructuralSurfaceAction extends IfcStructuralAction {
    public IfcProjectedOrTrueLengthEnum ProjectedOrTrue;
    public IfcStructuralSurfaceActivityTypeEnum PredefinedType;

    // === EXTENDED BY ===
    // IfcStructuralPlanarAction

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
}
