public class IfcAnnotation : IfcProduct
{
    public IfcAnnotationTypeEnum PredefinedType { get; set; }

    // === INVERSE CLAUSES ===
    // ContainedInStructure : SET [0:1] OF IfcRelContainedInSpatialStructure FOR RelatedElements
}
