public class IfcJunctionBoxType : IfcFlowFittingType
{
    public IfcJunctionBoxTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcJunctionBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcJunctionBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
