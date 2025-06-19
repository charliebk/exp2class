public class IfcSubContractResource : IfcConstructionResource
{
    public IfcSubContractResourceTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
