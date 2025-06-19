public class IfcFilter : IfcFlowTreatmentDevice
{
    public IfcFilterTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFilterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFilterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCFILTERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
