class IfcMaterialProfileSet extends IfcMaterialDefinition {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCMATERIALPROFILE[]} */
        this.MaterialProfiles = null;
        /** @type {IFCCOMPOSITEPROFILEDEF} */
        this.CompositeProfile = null;
    }
}
