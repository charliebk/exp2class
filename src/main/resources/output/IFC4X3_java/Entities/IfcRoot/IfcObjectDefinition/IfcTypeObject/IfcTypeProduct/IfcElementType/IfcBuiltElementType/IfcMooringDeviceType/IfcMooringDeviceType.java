public class IfcMooringDeviceType extends IfcBuiltElementType {
    public IfcMooringDeviceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMooringDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMooringDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
