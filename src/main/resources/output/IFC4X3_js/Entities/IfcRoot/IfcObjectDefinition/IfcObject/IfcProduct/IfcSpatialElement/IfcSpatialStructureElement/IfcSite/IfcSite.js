class IfcSite extends IfcSpatialStructureElement {
    constructor() {
        /** @type {IFCCOMPOUNDPLANEANGLEMEASURE} */
        this.RefLatitude = null;
        /** @type {IFCCOMPOUNDPLANEANGLEMEASURE} */
        this.RefLongitude = null;
        /** @type {IFCLENGTHMEASURE} */
        this.RefElevation = null;
        /** @type {IFCLABEL} */
        this.LandTitleNumber = null;
        /** @type {IFCPOSTALADDRESS} */
        this.SiteAddress = null;
    }
}
