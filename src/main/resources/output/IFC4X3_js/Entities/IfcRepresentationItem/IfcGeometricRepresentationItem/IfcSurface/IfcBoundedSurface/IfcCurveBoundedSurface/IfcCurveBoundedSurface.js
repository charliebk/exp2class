class IfcCurveBoundedSurface extends IfcBoundedSurface {
    constructor() {
        /** @type {IFCSURFACE} */
        this.BasisSurface = null;
        /** @type {SET [1:?] OF IFCBOUNDARYCURVE} */
        this.Boundaries = null;
        /** @type {IFCBOOLEAN} */
        this.ImplicitOuter = null;
    }
}
