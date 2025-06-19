public class IfcPumpType extends IfcFlowMovingDeviceType {
    public IfcPumpTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcPumpTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPumpTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
