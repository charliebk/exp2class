public class IfcMarinePart extends IfcFacilityPart {
    public IfcMarinePartTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMarinePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMarinePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
