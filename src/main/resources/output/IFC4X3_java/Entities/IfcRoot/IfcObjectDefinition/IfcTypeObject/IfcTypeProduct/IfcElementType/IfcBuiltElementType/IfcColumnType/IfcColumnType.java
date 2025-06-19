public class IfcColumnType extends IfcBuiltElementType {
    public IfcColumnTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcColumnTypeEnum.USERDEFINED) OR ((PredefinedType = IfcColumnTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
