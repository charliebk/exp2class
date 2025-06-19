class IfcRelConnectsElements extends IfcRelConnects {
    constructor() {
        /** @type {IFCCONNECTIONGEOMETRY} */
        this.ConnectionGeometry = null;
        /** @type {IFCELEMENT} */
        this.RelatingElement = null;
        /** @type {IFCELEMENT} */
        this.RelatedElement = null;
    }

    // === EXTENDED BY ===
    // IfcRelConnectsPathElements
    // IfcRelConnectsWithRealizingElements

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingElement :<>: RelatedElement
}
