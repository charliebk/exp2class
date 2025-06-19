public class IfcDistributionChamberElementType extends IfcDistributionFlowElementType {
    public IfcDistributionChamberElementTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
