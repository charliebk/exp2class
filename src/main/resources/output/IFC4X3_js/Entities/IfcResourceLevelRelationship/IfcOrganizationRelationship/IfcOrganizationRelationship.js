class IfcOrganizationRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCORGANIZATION} */
        this.RelatingOrganization = null;
        /** @type {SET [1:?] OF IFCORGANIZATION} */
        this.RelatedOrganizations = null;
    }
}
