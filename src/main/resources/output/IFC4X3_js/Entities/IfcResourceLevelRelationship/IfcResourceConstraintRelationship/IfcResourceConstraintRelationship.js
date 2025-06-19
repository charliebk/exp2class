class IfcResourceConstraintRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCCONSTRAINT} */
        this.RelatingConstraint = null;
        /** @type {SET [1:?] OF IFCRESOURCEOBJECTSELECT} */
        this.RelatedResourceObjects = null;
    }
}
