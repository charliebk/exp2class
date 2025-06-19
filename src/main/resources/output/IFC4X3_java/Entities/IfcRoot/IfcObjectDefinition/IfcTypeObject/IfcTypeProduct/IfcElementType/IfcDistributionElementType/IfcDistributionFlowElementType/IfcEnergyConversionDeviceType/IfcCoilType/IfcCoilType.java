public class IfcCoilType extends IfcEnergyConversionDeviceType {
    public IfcCoilTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
