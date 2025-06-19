public class IfcCableCarrierFittingType extends IfcFlowFittingType {
    public IfcCableCarrierFittingTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCableCarrierFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableCarrierFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
