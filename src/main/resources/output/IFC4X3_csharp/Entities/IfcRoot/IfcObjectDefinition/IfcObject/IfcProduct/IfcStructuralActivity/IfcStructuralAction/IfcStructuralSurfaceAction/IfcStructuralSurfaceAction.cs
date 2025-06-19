public class IfcStructuralSurfaceAction : IfcStructuralAction
{
    public IfcProjectedOrTrueLengthEnum ProjectedOrTrue { get; set; }
    public IfcStructuralSurfaceActivityTypeEnum PredefinedType { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralPlanarAction

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
}
