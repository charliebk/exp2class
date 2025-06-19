public class IfcConstructionMaterialResource : IfcConstructionResource
{
    public IfcConstructionMaterialResourceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
