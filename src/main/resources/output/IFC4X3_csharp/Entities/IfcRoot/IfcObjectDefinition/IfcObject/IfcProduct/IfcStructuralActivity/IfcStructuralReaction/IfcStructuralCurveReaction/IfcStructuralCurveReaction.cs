public class IfcStructuralCurveReaction : IfcStructuralReaction
{
    public IfcStructuralCurveActivityTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // HasObjectType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
    // SuitablePredefinedType : (PredefinedType <> IfcStructuralCurveActivityTypeEnum.SINUS) AND (PredefinedType <> IfcStructuralCurveActivityTypeEnum.PARABOLA)
}
