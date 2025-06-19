public class IfcOutletType : IfcFlowTerminalType
{
    public IfcOutletTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcOutletTypeEnum.USERDEFINED) OR ((PredefinedType = IfcOutletTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
