public class IfcCrewResourceType extends IfcConstructionResourceType {
    public IfcCrewResourceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
