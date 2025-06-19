public class IfcCommunicationsApplianceType : IfcFlowTerminalType
{
    public IfcCommunicationsApplianceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCommunicationsApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
