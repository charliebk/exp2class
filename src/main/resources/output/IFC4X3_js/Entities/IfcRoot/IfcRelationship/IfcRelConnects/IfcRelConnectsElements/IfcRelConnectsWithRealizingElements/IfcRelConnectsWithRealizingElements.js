class IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements {
    constructor() {
        /** @type {SET [1:?] OF IFCELEMENT} */
        this.RealizingElements = null;
        /** @type {IFCLABEL} */
        this.ConnectionType = null;
    }
}
