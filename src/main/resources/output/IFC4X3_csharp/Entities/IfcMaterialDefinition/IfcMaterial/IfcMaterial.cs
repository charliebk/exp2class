public class IfcMaterial : IfcMaterialDefinition
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcLabel Category { get; set; }

    // === INVERSE CLAUSES ===
    // HasRepresentation : SET [0:1] OF IfcMaterialDefinitionRepresentation FOR RepresentedMaterial
    // IsRelatedWith : SET [0:?] OF IfcMaterialRelationship FOR RelatedMaterials
    // RelatesTo : SET [0:1] OF IfcMaterialRelationship FOR RelatingMaterial
}
