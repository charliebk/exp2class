public class IfcRailwayPart extends IfcFacilityPart {
    public IfcRailwayPartTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRailwayPartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailwayPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
