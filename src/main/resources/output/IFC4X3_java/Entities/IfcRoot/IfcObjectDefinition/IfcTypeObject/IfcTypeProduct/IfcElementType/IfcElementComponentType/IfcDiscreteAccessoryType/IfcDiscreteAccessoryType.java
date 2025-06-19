public class IfcDiscreteAccessoryType extends IfcElementComponentType {
    public IfcDiscreteAccessoryTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDiscreteAccessoryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDiscreteAccessoryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
