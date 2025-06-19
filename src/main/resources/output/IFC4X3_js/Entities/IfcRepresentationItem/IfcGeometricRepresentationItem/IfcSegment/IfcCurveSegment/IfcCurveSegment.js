class IfcCurveSegment extends IfcSegment {
    constructor() {
        /** @type {IFCPLACEMENT} */
        this.Placement = null;
        /** @type {IFCCURVEMEASURESELECT} */
        this.SegmentStart = null;
        /** @type {IFCCURVEMEASURESELECT} */
        this.SegmentLength = null;
        /** @type {IFCCURVE} */
        this.ParentCurve = null;
    }
}
