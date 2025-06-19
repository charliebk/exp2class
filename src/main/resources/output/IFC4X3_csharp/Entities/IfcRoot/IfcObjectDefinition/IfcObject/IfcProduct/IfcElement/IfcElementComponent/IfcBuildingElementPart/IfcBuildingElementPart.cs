public class IfcBuildingElementPart : IfcElementComponent
{
    public IfcBuildingElementPartTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuildingElementPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCBUILDINGELEMENTPARTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
