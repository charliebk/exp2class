public class IfcControllerType extends IfcDistributionControlElementType {
    public IfcControllerTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcControllerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcControllerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
