class IfcRelPositions extends IfcRelConnects {
    constructor() {
        /** @type {IFCPOSITIONINGELEMENT} */
        this.RelatingPositioningElement = null;
        /** @type {SET [1:?] OF IFCPRODUCT} */
        this.RelatedProducts = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* RelatedProducts | RelatingPositioningElement :=: temp)) = 0
}
