public class IfcMobileTelecommunicationsApplianceType extends IfcFlowTerminalType {
    public IfcMobileTelecommunicationsApplianceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
