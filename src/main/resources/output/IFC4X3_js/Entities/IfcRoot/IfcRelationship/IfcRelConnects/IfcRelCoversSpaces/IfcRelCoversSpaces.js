class IfcRelCoversSpaces extends IfcRelConnects {
    constructor() {
        /** @type {IFCSPACE} */
        this.RelatingSpace = null;
        /** @type {SET [1:?] OF IFCCOVERING} */
        this.RelatedCoverings = null;
    }
}
