public class IfcAudioVisualApplianceType : IfcFlowTerminalType
{
    public IfcAudioVisualApplianceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcAudioVisualApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAudioVisualApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
