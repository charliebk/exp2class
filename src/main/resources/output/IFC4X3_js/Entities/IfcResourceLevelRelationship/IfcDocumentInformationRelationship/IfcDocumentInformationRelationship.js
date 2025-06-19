class IfcDocumentInformationRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCDOCUMENTINFORMATION} */
        this.RelatingDocument = null;
        /** @type {SET [1:?] OF IFCDOCUMENTINFORMATION} */
        this.RelatedDocuments = null;
        /** @type {IFCLABEL} */
        this.RelationshipType = null;
    }
}
