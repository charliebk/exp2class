public class IfcFacilityPartCommon extends IfcFacilityPart {
    public IfcFacilityPartCommonTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFacilityPartCommonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFacilityPartCommonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
