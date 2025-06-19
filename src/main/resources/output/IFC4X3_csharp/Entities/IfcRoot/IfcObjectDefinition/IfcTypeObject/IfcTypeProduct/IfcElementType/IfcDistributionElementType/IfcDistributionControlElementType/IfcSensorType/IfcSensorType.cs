public class IfcSensorType : IfcDistributionControlElementType
{
    public IfcSensorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSensorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSensorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
