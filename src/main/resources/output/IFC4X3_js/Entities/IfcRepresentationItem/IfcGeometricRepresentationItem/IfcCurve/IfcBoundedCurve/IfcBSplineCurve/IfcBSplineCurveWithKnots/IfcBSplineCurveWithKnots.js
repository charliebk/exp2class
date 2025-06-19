class IfcBSplineCurveWithKnots extends IfcBSplineCurve {
    constructor() {
        /** @type {IFCINTEGER[]} */
        this.KnotMultiplicities = null;
        /** @type {IFCPARAMETERVALUE[]} */
        this.Knots = null;
        /** @type {IFCKNOTTYPE} */
        this.KnotSpec = null;
    }

    // === EXTENDED BY ===
    // IfcRationalBSplineCurveWithKnots

    // === WHERE CLAUSES ===
    // ConsistentBSpline : IfcConstraintsParamBSpline(Degree, UpperIndexOnKnots, UpperIndexOnControlPoints, KnotMultiplicities, Knots)
    // CorrespondingKnotLists : SIZEOF(KnotMultiplicities) = UpperIndexOnKnots

    // === DERIVE CLAUSES ===
    // UpperIndexOnKnots : IfcInteger := SIZEOF(Knots)
}
