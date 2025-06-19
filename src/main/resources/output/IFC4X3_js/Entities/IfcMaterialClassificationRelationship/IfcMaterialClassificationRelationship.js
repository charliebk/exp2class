class IfcMaterialClassificationRelationship {
    constructor() {
        /** @type {SET [1:?] OF IFCCLASSIFICATIONSELECT} */
        this.MaterialClassifications = null;
        /** @type {IFCMATERIAL} */
        this.ClassifiedMaterial = null;
    }
}
