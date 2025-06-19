public class IfcLaborResourceType : IfcConstructionResourceType
{
    public IfcLaborResourceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
