public class IfcMember extends IfcBuiltElement {
    public IfcMemberTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMemberTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMemberTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCMEMBERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
