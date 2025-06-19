public class IfcDoorType extends IfcBuiltElementType {
    public IfcDoorTypeEnum PredefinedType;
    public IfcDoorTypeOperationEnum OperationType;
    public IfcBoolean ParameterTakesPrecedence;
    public IfcLabel UserDefinedOperationType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
