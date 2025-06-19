public class IfcOutlet : IfcFlowTerminal
{
    public IfcOutletTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcOutletTypeEnum.USERDEFINED) OR ((PredefinedType = IfcOutletTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCOUTLETTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
