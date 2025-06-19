public class IfcProjectionElement extends IfcFeatureElementAddition {
    public IfcProjectionElementTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProjectionElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProjectionElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
