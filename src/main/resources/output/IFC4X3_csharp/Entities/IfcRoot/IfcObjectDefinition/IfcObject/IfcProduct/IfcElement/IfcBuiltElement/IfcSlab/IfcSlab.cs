public class IfcSlab : IfcBuiltElement
{
    public IfcSlabTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSlabTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSlabTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSLABTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
