class IfcConnectedFaceSet extends IfcTopologicalRepresentationItem {
    constructor() {
        /** @type {SET [1:?] OF IFCFACE} */
        this.CfsFaces = null;
    }

    // === EXTENDED BY ===
    // IfcClosedShell
    // IfcOpenShell
}
