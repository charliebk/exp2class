public class IfcVoidingFeature : IfcFeatureElementSubtraction
{
    public IfcVoidingFeatureTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVoidingFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVoidingFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
