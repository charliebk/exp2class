public class IfcSurfaceFeature extends IfcFeatureElement {
    public IfcSurfaceFeatureTypeEnum PredefinedType;

    // === INVERSE CLAUSES ===
    // AdheresToElement : IfcRelAdheresToElement FOR RelatedSurfaceFeatures

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSurfaceFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSurfaceFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
