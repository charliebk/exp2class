public class IfcActuatorType extends IfcDistributionControlElementType {
    public IfcActuatorTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcActuatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcActuatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
