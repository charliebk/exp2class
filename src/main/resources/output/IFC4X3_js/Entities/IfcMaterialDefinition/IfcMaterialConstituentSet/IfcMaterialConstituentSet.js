class IfcMaterialConstituentSet extends IfcMaterialDefinition {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {SET [1:?] OF IFCMATERIALCONSTITUENT} */
        this.MaterialConstituents = null;
    }
}
