public class IfcDoorType : IfcBuiltElementType
{
    public IfcDoorTypeEnum PredefinedType { get; set; }
    public IfcDoorTypeOperationEnum OperationType { get; set; }
    public IfcBoolean ParameterTakesPrecedence { get; set; }
    public IfcLabel UserDefinedOperationType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
