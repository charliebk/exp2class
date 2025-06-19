public class IfcStructuralCurveAction extends IfcStructuralAction {
    public IfcProjectedOrTrueLengthEnum ProjectedOrTrue;
    public IfcStructuralCurveActivityTypeEnum PredefinedType;

    // === EXTENDED BY ===
    // IfcStructuralLinearAction

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    // ProjectedIsGlobal : (NOT EXISTS(ProjectedOrTrue)) OR ((ProjectedOrTrue <> PROJECTED_LENGTH) OR (SELF\IfcStructuralActivity.GlobalOrLocal = GLOBAL_COORDS))
    // SuitablePredefinedType : PredefinedType <> IfcStructuralCurveActivityTypeEnum.EQUIDISTANT
}
