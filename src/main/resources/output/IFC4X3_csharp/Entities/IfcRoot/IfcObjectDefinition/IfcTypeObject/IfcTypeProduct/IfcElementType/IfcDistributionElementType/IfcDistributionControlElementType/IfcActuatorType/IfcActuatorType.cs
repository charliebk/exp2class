public class IfcActuatorType : IfcDistributionControlElementType
{
    public IfcActuatorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcActuatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcActuatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
