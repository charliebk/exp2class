class IfcApprovalRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCAPPROVAL} */
        this.RelatingApproval = null;
        /** @type {SET [1:?] OF IFCAPPROVAL} */
        this.RelatedApprovals = null;
    }
}
