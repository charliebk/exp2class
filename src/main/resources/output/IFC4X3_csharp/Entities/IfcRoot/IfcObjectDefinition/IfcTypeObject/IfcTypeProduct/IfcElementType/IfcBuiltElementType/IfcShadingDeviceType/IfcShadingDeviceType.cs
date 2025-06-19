public class IfcShadingDeviceType : IfcBuiltElementType
{
    public IfcShadingDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcShadingDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcShadingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
