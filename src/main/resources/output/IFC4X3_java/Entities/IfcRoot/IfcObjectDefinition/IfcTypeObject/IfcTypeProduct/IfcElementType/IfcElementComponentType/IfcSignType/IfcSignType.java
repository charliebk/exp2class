public class IfcSignType extends IfcElementComponentType {
    public IfcSignTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSignTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
