class IfcRelAssigns extends IfcRelationship {
    constructor() {
        /** @type {SET [1:?] OF IFCOBJECTDEFINITION} */
        this.RelatedObjects = null;
        /** @type {IFCSTRIPPED} */
        this.RelatedObjectsType = null;
    }

    // === EXTENDED BY ===
    // IfcRelAssignsToActor
    // IfcRelAssignsToControl
    // IfcRelAssignsToGroup
    // IfcRelAssignsToProcess
    // IfcRelAssignsToProduct
    // IfcRelAssignsToResource
}
