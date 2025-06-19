class IfcRelAdheresToElement extends IfcRelDecomposes {
    constructor() {
        /** @type {IFCELEMENT} */
        this.RelatingElement = null;
        /** @type {SET [1:?] OF IFCSURFACEFEATURE} */
        this.RelatedSurfaceFeatures = null;
    }
}
