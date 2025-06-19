public class IfcMaterialClassificationRelationship
{
    public SET [1:?] OF IfcClassificationSelect MaterialClassifications { get; set; }
    public IfcMaterial ClassifiedMaterial { get; set; }
}
