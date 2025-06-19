class IfcOrganization {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCACTORROLE[]} */
        this.Roles = null;
        /** @type {IFCADDRESS[]} */
        this.Addresses = null;
    }

    // === INVERSE CLAUSES ===
    // IsRelatedBy : SET [0:?] OF IfcOrganizationRelationship FOR RelatedOrganizations
    // Relates : SET [0:?] OF IfcOrganizationRelationship FOR RelatingOrganization
    // Engages : SET [0:?] OF IfcPersonAndOrganization FOR TheOrganization
}
