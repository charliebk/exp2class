public class IfcCompressorType : IfcFlowMovingDeviceType
{
    public IfcCompressorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCompressorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCompressorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
