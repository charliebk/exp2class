public class IfcMarineFacility extends IfcFacility {
    public IfcMarineFacilityTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarineFacilityTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarineFacilityTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
