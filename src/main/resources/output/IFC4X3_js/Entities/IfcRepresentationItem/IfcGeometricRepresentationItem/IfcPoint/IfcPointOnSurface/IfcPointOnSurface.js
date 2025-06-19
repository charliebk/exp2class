class IfcPointOnSurface extends IfcPoint {
    constructor() {
        /** @type {IFCSURFACE} */
        this.BasisSurface = null;
        /** @type {IFCPARAMETERVALUE} */
        this.PointParameterU = null;
        /** @type {IFCPARAMETERVALUE} */
        this.PointParameterV = null;
    }
}
