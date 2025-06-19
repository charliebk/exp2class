public class IfcSign : IfcElementComponent
{
    public IfcSignTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSignTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSIGNTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
