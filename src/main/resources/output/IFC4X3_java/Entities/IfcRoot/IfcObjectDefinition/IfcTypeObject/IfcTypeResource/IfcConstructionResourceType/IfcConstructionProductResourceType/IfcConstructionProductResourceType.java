public class IfcConstructionProductResourceType extends IfcConstructionResourceType {
    public IfcConstructionProductResourceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
