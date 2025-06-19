public class IfcControllerType : IfcDistributionControlElementType
{
    public IfcControllerTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcControllerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcControllerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
