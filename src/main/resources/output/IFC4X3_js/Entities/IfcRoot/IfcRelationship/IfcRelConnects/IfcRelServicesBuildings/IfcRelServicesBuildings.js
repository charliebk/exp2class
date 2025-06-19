class IfcRelServicesBuildings extends IfcRelConnects {
    constructor() {
        /** @type {IFCSYSTEM} */
        this.RelatingSystem = null;
        /** @type {SET [1:?] OF IFCSPATIALELEMENT} */
        this.RelatedBuildings = null;
    }
}
