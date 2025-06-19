public class IfcStructuralSurfaceReaction extends IfcStructuralReaction {
    public IfcStructuralSurfaceActivityTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // HasPredefinedType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
