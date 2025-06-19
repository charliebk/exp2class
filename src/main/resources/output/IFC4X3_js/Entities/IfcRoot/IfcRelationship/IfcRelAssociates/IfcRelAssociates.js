class IfcRelAssociates extends IfcRelationship {
    constructor() {
        /** @type {SET [1:?] OF IFCDEFINITIONSELECT} */
        this.RelatedObjects = null;
    }

    // === EXTENDED BY ===
    // IfcRelAssociatesApproval
    // IfcRelAssociatesClassification
    // IfcRelAssociatesConstraint
    // IfcRelAssociatesDocument
    // IfcRelAssociatesLibrary
    // IfcRelAssociatesMaterial
    // IfcRelAssociatesProfileDef
}
