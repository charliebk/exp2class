class IfcPointByDistanceExpression extends IfcPoint {
    constructor() {
        /** @type {IFCCURVEMEASURESELECT} */
        this.DistanceAlong = null;
        /** @type {IFCLENGTHMEASURE} */
        this.OffsetLateral = null;
        /** @type {IFCLENGTHMEASURE} */
        this.OffsetVertical = null;
        /** @type {IFCLENGTHMEASURE} */
        this.OffsetLongitudinal = null;
        /** @type {IFCCURVE} */
        this.BasisCurve = null;
    }
}
