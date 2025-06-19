public class IfcMooringDeviceType : IfcBuiltElementType
{
    public IfcMooringDeviceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMooringDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMooringDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
