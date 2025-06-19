public class IfcJunctionBox extends IfcFlowFitting {
    public IfcJunctionBoxTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcJunctionBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcJunctionBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCJUNCTIONBOXTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
