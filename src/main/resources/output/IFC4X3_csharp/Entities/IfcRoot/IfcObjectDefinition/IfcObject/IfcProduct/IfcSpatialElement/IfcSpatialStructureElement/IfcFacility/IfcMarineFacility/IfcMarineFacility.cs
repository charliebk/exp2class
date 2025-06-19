public class IfcMarineFacility : IfcFacility
{
    public IfcMarineFacilityTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarineFacilityTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarineFacilityTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
