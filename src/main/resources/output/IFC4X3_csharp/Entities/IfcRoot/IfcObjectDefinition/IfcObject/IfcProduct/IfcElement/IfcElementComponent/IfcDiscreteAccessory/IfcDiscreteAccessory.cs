public class IfcDiscreteAccessory : IfcElementComponent
{
    public IfcDiscreteAccessoryTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDiscreteAccessoryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDiscreteAccessoryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDISCRETEACCESSORYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
