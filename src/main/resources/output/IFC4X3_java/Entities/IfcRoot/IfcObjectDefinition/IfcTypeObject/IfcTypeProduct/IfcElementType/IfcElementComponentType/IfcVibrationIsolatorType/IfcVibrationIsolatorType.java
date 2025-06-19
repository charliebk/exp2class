public class IfcVibrationIsolatorType extends IfcElementComponentType {
    public IfcVibrationIsolatorTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcVibrationIsolatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationIsolatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
