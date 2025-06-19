public class IfcVibrationIsolatorType : IfcElementComponentType
{
    public IfcVibrationIsolatorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcVibrationIsolatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationIsolatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
