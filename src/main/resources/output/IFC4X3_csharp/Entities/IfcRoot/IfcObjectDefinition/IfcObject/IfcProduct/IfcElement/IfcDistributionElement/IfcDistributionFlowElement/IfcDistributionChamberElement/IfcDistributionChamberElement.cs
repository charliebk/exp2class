public class IfcDistributionChamberElement : IfcDistributionFlowElement
{
    public IfcDistributionChamberElementTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDISTRIBUTIONCHAMBERELEMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
