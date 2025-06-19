class IfcExternalSpatialElement extends IfcExternalSpatialStructureElement {
    constructor() {
        /** @type {IFCEXTERNALSPATIALELEMENTTYPEENUM} */
        this.PredefinedType = null;
    }

    // === INVERSE CLAUSES ===
    // BoundedBy : SET [0:?] OF IfcRelSpaceBoundary FOR RelatingSpace
}
