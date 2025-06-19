class IfcRelCoversBldgElements extends IfcRelConnects {
    constructor() {
        /** @type {IFCELEMENT} */
        this.RelatingBuildingElement = null;
        /** @type {SET [1:?] OF IFCCOVERING} */
        this.RelatedCoverings = null;
    }
}
