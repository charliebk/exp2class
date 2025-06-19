class IfcSweptDiskSolid extends IfcSolidModel {
    constructor() {
        /** @type {IFCCURVE} */
        this.Directrix = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Radius = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.InnerRadius = null;
        /** @type {IFCPARAMETERVALUE} */
        this.StartParam = null;
        /** @type {IFCPARAMETERVALUE} */
        this.EndParam = null;
    }

    // === EXTENDED BY ===
    // IfcSweptDiskSolidPolygonal

    // === WHERE CLAUSES ===
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
    // DirectrixDim : Directrix.Dim = 3
    // InnerRadiusSize : (NOT EXISTS(InnerRadius)) OR (Radius > InnerRadius)
}
