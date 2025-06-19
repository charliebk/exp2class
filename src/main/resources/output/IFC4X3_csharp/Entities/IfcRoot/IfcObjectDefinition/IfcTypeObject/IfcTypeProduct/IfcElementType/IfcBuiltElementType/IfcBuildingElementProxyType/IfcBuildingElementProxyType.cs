public class IfcBuildingElementProxyType : IfcBuiltElementType
{
    public IfcBuildingElementProxyTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
