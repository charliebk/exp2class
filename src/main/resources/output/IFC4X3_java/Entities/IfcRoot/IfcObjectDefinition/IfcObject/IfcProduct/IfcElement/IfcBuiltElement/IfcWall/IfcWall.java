public class IfcWall extends IfcBuiltElement {
    public IfcWallTypeEnum PredefinedType;

    // === EXTENDED BY ===
    // IfcWallStandardCase

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCWALLTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
