public class IfcRoadPart extends IfcFacilityPart {
    public IfcRoadPartTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
