class IfcCompositeCurveSegment extends IfcSegment {
    constructor() {
        /** @type {IFCBOOLEAN} */
        this.SameSense = null;
        /** @type {IFCCURVE} */
        this.ParentCurve = null;
    }

    // === EXTENDED BY ===
    // IfcReparametrisedCompositeCurveSegment

    // === WHERE CLAUSES ===
    // ParentIsBoundedCurve : ('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(ParentCurve))
}
