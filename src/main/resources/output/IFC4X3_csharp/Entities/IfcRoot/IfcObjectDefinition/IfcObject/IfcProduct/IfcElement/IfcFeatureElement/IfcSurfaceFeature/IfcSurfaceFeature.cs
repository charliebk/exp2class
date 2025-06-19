public class IfcSurfaceFeature : IfcFeatureElement
{
    public IfcSurfaceFeatureTypeEnum PredefinedType { get; set; }

    // === INVERSE CLAUSES ===
    // AdheresToElement : IfcRelAdheresToElement FOR RelatedSurfaceFeatures

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSurfaceFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSurfaceFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
