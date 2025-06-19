public class IfcPipeSegmentType : IfcFlowSegmentType
{
    public IfcPipeSegmentTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPipeSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
