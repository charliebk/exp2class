class IfcMaterialRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCMATERIAL} */
        this.RelatingMaterial = null;
        /** @type {SET [1:?] OF IFCMATERIAL} */
        this.RelatedMaterials = null;
        /** @type {IFCLABEL} */
        this.MaterialExpression = null;
    }
}
