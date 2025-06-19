class IfcExternalReferenceRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCEXTERNALREFERENCE} */
        this.RelatingReference = null;
        /** @type {SET [1:?] OF IFCRESOURCEOBJECTSELECT} */
        this.RelatedResourceObjects = null;
    }
}
