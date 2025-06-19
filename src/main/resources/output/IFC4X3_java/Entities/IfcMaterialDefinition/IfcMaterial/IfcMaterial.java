public class IfcMaterial extends IfcMaterialDefinition {
    public IfcLabel Name;
    public IfcText Description;
    public IfcLabel Category;

    // === INVERSE CLAUSES ===
    // HasRepresentation : SET [0:1] OF IfcMaterialDefinitionRepresentation FOR RepresentedMaterial
    // IsRelatedWith : SET [0:?] OF IfcMaterialRelationship FOR RelatedMaterials
    // RelatesTo : SET [0:1] OF IfcMaterialRelationship FOR RelatingMaterial
}
