class IfcGradientCurve extends IfcCompositeCurve {
    constructor() {
        /** @type {IFCBOUNDEDCURVE} */
        this.BaseCurve = null;
        /** @type {IFCPLACEMENT} */
        this.EndPoint = null;
    }
}
