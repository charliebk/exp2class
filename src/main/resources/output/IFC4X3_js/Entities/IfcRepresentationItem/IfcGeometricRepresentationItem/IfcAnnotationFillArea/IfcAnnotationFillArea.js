class IfcAnnotationFillArea extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCCURVE} */
        this.OuterBoundary = null;
        /** @type {SET [1:?] OF IFCCURVE} */
        this.InnerBoundaries = null;
    }
}
