public class IfcWindowType : IfcBuiltElementType
{
    public IfcWindowTypeEnum PredefinedType { get; set; }
    public IfcWindowTypePartitioningEnum PartitioningType { get; set; }
    public IfcBoolean ParameterTakesPrecedence { get; set; }
    public IfcLabel UserDefinedPartitioningType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
