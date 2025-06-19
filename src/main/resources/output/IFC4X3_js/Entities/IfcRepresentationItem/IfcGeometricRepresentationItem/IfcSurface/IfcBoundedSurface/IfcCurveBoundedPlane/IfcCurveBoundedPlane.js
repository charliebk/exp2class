class IfcCurveBoundedPlane extends IfcBoundedSurface {
    constructor() {
        /** @type {IFCPLANE} */
        this.BasisSurface = null;
        /** @type {IFCCURVE} */
        this.OuterBoundary = null;
        /** @type {SET [0:?] OF IFCCURVE} */
        this.InnerBoundaries = null;
    }
}
