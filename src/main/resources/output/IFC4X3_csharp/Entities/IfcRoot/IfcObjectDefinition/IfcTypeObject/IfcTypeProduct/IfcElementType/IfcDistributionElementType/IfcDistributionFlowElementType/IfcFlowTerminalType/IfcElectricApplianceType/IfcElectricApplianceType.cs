public class IfcElectricApplianceType : IfcFlowTerminalType
{
    public IfcElectricApplianceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
