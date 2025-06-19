public class IfcCompressor : IfcFlowMovingDevice
{
    public IfcCompressorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCompressorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCompressorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCOMPRESSORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
