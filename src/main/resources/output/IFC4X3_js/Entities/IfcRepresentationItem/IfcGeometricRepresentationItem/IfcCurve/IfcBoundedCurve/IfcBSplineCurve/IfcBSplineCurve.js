class IfcBSplineCurve extends IfcBoundedCurve {
    constructor() {
        /** @type {IFCINTEGER} */
        this.Degree = null;
        /** @type {IFCCARTESIANPOINT[]} */
        this.ControlPointsList = null;
        /** @type {IFCBSPLINECURVEFORM} */
        this.CurveForm = null;
        /** @type {IFCLOGICAL} */
        this.ClosedCurve = null;
        /** @type {IFCLOGICAL} */
        this.SelfIntersect = null;
    }

    // === EXTENDED BY ===
    // IfcBSplineCurveWithKnots

    // === WHERE CLAUSES ===
    // SameDim : SIZEOF(QUERY(Temp <* ControlPointsList | Temp.Dim <> ControlPointsList[1].Dim)) = 0

    // === DERIVE CLAUSES ===
    // UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1)
    // ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints)
}
