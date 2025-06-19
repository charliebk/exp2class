class IfcConnectionCurveGeometry extends IfcConnectionGeometry {
    constructor() {
        /** @type {IFCCURVEOREDGECURVE} */
        this.CurveOnRelatingElement = null;
        /** @type {IFCCURVEOREDGECURVE} */
        this.CurveOnRelatedElement = null;
    }
}
