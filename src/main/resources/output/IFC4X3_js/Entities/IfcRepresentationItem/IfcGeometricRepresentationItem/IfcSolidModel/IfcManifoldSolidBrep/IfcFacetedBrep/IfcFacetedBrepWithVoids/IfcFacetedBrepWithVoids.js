class IfcFacetedBrepWithVoids extends IfcFacetedBrep {
    constructor() {
        /** @type {SET [1:?] OF IFCCLOSEDSHELL} */
        this.Voids = null;
    }
}
