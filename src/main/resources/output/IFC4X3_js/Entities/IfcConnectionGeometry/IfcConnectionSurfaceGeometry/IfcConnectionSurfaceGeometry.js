class IfcConnectionSurfaceGeometry extends IfcConnectionGeometry {
    constructor() {
        /** @type {IFCSURFACEORFACESURFACE} */
        this.SurfaceOnRelatingElement = null;
        /** @type {IFCSURFACEORFACESURFACE} */
        this.SurfaceOnRelatedElement = null;
    }
}
