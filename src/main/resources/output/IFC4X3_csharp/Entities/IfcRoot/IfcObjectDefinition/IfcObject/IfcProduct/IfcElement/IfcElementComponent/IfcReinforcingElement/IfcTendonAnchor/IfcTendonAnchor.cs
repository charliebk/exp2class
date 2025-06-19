public class IfcTendonAnchor : IfcReinforcingElement
{
    public IfcTendonAnchorTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTendonAnchorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonAnchorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTENDONANCHORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
