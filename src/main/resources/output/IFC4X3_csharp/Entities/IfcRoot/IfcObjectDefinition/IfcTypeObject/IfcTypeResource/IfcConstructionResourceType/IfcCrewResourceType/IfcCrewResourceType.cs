public class IfcCrewResourceType : IfcConstructionResourceType
{
    public IfcCrewResourceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
