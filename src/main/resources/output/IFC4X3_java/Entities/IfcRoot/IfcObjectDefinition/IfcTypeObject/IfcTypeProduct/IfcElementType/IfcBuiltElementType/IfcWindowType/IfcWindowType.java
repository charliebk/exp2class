public class IfcWindowType extends IfcBuiltElementType {
    public IfcWindowTypeEnum PredefinedType;
    public IfcWindowTypePartitioningEnum PartitioningType;
    public IfcBoolean ParameterTakesPrecedence;
    public IfcLabel UserDefinedPartitioningType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
