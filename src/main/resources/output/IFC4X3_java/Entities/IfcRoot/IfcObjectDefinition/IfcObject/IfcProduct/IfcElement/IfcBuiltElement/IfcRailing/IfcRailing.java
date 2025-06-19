public class IfcRailing extends IfcBuiltElement {
    public IfcRailingTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCRAILINGTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
