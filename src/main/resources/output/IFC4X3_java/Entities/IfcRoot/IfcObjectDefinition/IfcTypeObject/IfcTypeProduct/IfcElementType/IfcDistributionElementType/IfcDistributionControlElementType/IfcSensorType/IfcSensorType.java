public class IfcSensorType extends IfcDistributionControlElementType {
    public IfcSensorTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSensorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSensorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
