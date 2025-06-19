class IfcTrimmedCurve extends IfcBoundedCurve {
    constructor() {
        /** @type {IFCCURVE} */
        this.BasisCurve = null;
        /** @type {SET [1:2] OF IFCTRIMMINGSELECT} */
        this.Trim1 = null;
        /** @type {SET [1:2] OF IFCTRIMMINGSELECT} */
        this.Trim2 = null;
        /** @type {IFCBOOLEAN} */
        this.SenseAgreement = null;
        /** @type {IFCTRIMMINGPREFERENCE} */
        this.MasterRepresentation = null;
    }

    // === WHERE CLAUSES ===
    // NoTrimOfBoundedCurves : NOT('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(BasisCurve))
    // Trim1ValuesConsistent : (HIINDEX(Trim1) = 1) OR (TYPEOF(Trim1[1]) <> TYPEOF(Trim1[2]))
    // Trim2ValuesConsistent : (HIINDEX(Trim2) = 1) OR (TYPEOF(Trim2[1]) <> TYPEOF(Trim2[2]))
}
