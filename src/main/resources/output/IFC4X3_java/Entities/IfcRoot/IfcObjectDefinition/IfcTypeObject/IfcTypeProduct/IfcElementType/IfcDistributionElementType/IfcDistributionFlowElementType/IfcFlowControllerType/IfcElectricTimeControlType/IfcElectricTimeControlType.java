public class IfcElectricTimeControlType extends IfcFlowControllerType {
    public IfcElectricTimeControlTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcElectricTimeControlTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricTimeControlTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
