public class IfcStackTerminal : IfcFlowTerminal
{
    public IfcStackTerminalTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcStackTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStackTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSTACKTERMINALTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
