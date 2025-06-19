public class IfcUnitaryControlElementType : IfcDistributionControlElementType
{
    public IfcUnitaryControlElementTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryControlElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcUnitaryControlElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
