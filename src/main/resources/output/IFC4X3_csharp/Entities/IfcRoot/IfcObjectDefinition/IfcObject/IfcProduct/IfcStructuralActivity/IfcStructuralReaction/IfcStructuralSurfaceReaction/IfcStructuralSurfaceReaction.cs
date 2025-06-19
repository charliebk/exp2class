public class IfcStructuralSurfaceReaction : IfcStructuralReaction
{
    public IfcStructuralSurfaceActivityTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // HasPredefinedType : (PredefinedType <> IfcStructuralSurfaceActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
