public class IfcSignType : IfcElementComponentType
{
    public IfcSignTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcSignTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
