class IfcExtrudedAreaSolid extends IfcSweptAreaSolid {
    constructor() {
        /** @type {IFCDIRECTION} */
        this.ExtrudedDirection = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Depth = null;
    }

    // === EXTENDED BY ===
    // IfcExtrudedAreaSolidTapered

    // === WHERE CLAUSES ===
    // ValidExtrusionDirection : IfcDotProduct(IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([0.0,0.0,1.0]), SELF.ExtrudedDirection) <> 0.0
}
