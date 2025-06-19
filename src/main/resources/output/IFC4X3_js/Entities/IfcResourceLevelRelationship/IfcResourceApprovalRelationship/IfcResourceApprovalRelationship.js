class IfcResourceApprovalRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {SET [1:?] OF IFCRESOURCEOBJECTSELECT} */
        this.RelatedResourceObjects = null;
        /** @type {IFCAPPROVAL} */
        this.RelatingApproval = null;
    }
}
