public class IfcVoidingFeature extends IfcFeatureElementSubtraction {
    public IfcVoidingFeatureTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVoidingFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVoidingFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
