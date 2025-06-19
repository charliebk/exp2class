public class IfcBridgePart extends IfcFacilityPart {
    public IfcBridgePartTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBridgePartTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBridgePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
