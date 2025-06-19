public class IfcFanType extends IfcFlowMovingDeviceType {
    public IfcFanTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcFanTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFanTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
