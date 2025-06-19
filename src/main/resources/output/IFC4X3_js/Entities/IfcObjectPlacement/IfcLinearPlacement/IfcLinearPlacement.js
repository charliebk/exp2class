class IfcLinearPlacement extends IfcObjectPlacement {
    constructor() {
        /** @type {IFCAXIS2PLACEMENTLINEAR} */
        this.RelativePlacement = null;
        /** @type {IFCAXIS2PLACEMENT3D} */
        this.CartesianPosition = null;
    }
}
