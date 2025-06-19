class IfcRelConnectsPorts extends IfcRelConnects {
    constructor() {
        /** @type {IFCPORT} */
        this.RelatingPort = null;
        /** @type {IFCPORT} */
        this.RelatedPort = null;
        /** @type {IFCELEMENT} */
        this.RealizingElement = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingPort :<>: RelatedPort
}
