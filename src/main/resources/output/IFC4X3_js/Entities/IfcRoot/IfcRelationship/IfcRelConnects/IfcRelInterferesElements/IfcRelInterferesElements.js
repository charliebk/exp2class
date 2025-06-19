class IfcRelInterferesElements extends IfcRelConnects {
    constructor() {
        /** @type {IFCINTERFERENCESELECT} */
        this.RelatingElement = null;
        /** @type {IFCINTERFERENCESELECT} */
        this.RelatedElement = null;
        /** @type {IFCCONNECTIONGEOMETRY} */
        this.InterferenceGeometry = null;
        /** @type {IFCIDENTIFIER} */
        this.InterferenceType = null;
        /** @type {IFCLOGICAL} */
        this.ImpliedOrder = null;
        /** @type {IFCSPATIALZONE} */
        this.InterferenceSpace = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingElement :<>: RelatedElement
}
