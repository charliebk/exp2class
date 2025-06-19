public class IfcDuctSegmentType : IfcFlowSegmentType
{
    public IfcDuctSegmentTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDuctSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
