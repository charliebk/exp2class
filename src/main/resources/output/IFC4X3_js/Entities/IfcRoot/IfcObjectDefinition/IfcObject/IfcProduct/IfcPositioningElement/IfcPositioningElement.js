class IfcPositioningElement extends IfcProduct {
    constructor() {
        // no parameters
    }

    // === EXTENDED BY ===
    // IfcGrid
    // IfcLinearPositioningElement
    // IfcReferent

    // === INVERSE CLAUSES ===
    // ContainedInStructure : SET [0:1] OF IfcRelContainedInSpatialStructure FOR RelatedElements
    // Positions : SET [0:?] OF IfcRelPositions FOR RelatingPositioningElement

    // === WHERE CLAUSES ===
    // HasPlacement : EXISTS(SELF\IfcProduct.ObjectPlacement)
}
