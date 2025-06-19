class IfcDirectrixCurveSweptAreaSolid extends IfcSweptAreaSolid {
    constructor() {
        /** @type {IFCCURVE} */
        this.Directrix = null;
        /** @type {IFCCURVEMEASURESELECT} */
        this.StartParam = null;
        /** @type {IFCCURVEMEASURESELECT} */
        this.EndParam = null;
    }

    // === EXTENDED BY ===
    // IfcFixedReferenceSweptAreaSolid
    // IfcSurfaceCurveSweptAreaSolid

    // === WHERE CLAUSES ===
    // DirectrixBounded : (EXISTS(StartParam) AND EXISTS(EndParam)) OR (SIZEOF(['IFC4X3_DEV_73740fe4.IFCCONIC', 'IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE'] * TYPEOF(Directrix)) = 1)
}
