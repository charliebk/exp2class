public class IfcDistributionChamberElementType : IfcDistributionFlowElementType
{
    public IfcDistributionChamberElementTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
