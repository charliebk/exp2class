public class IfcFastenerType extends IfcElementComponentType {
    public IfcFastenerTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
