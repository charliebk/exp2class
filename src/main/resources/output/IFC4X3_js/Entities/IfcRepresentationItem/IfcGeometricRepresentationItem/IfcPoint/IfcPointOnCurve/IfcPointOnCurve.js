class IfcPointOnCurve extends IfcPoint {
    constructor() {
        /** @type {IFCCURVE} */
        this.BasisCurve = null;
        /** @type {IFCPARAMETERVALUE} */
        this.PointParameter = null;
    }
}
