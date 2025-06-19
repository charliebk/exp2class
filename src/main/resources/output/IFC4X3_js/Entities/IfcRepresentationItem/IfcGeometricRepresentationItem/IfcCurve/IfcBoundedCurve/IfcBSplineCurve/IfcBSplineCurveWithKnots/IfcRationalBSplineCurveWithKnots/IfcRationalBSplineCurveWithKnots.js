class IfcRationalBSplineCurveWithKnots extends IfcBSplineCurveWithKnots {
    constructor() {
        /** @type {IFCREAL[]} */
        this.WeightsData = null;
    }

    // === WHERE CLAUSES ===
    // SameNumOfWeightsAndPoints : SIZEOF(WeightsData) = SIZEOF(SELF\IfcBSplineCurve.ControlPointsList)
    // WeightsGreaterZero : IfcCurveWeightsPositive(SELF)

    // === DERIVE CLAUSES ===
    // Weights : ARRAY [0:UpperIndexOnControlPoints] OF IfcReal := IfcListToArray(WeightsData,0,SELF\IfcBSplineCurve.UpperIndexOnControlPoints)
}
