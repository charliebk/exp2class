public class IfcConstructionMaterialResourceType extends IfcConstructionResourceType {
    public IfcConstructionMaterialResourceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
}
