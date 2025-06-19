public class IfcBuildingElementProxyType extends IfcBuiltElementType {
    public IfcBuildingElementProxyTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
