public class IfcFlowInstrumentType extends IfcDistributionControlElementType {
    public IfcFlowInstrumentTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFlowInstrumentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowInstrumentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
