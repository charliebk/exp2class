public class IfcRoad extends IfcFacility {
    public IfcRoadTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcRoadTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoadTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
