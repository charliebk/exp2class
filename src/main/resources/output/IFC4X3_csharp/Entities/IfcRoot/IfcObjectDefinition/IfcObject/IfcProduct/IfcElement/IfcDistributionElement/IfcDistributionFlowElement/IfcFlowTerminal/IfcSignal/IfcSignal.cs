public class IfcSignal : IfcFlowTerminal
{
    public IfcSignalTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSignalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSIGNALTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
