public class IfcConveyorSegmentType extends IfcFlowSegmentType {
    public IfcConveyorSegmentTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcConveyorSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConveyorSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
