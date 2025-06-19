public class IfcConveyorSegmentType : IfcFlowSegmentType
{
    public IfcConveyorSegmentTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcConveyorSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConveyorSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
