public class IfcFacilityPartCommon : IfcFacilityPart
{
    public IfcFacilityPartCommonTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFacilityPartCommonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFacilityPartCommonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
