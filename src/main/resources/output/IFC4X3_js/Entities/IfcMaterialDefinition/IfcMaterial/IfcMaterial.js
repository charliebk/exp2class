class IfcMaterial extends IfcMaterialDefinition {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCLABEL} */
        this.Category = null;
    }

    // === INVERSE CLAUSES ===
    // HasRepresentation : SET [0:1] OF IfcMaterialDefinitionRepresentation FOR RepresentedMaterial
    // IsRelatedWith : SET [0:?] OF IfcMaterialRelationship FOR RelatedMaterials
    // RelatesTo : SET [0:1] OF IfcMaterialRelationship FOR RelatingMaterial
}
