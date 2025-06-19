public class IfcStair : IfcBuiltElement
{
    public IfcStairTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcStairTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSTAIRTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
