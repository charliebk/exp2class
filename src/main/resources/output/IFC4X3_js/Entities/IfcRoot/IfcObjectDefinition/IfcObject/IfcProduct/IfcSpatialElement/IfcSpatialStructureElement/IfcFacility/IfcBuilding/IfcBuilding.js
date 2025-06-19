class IfcBuilding extends IfcFacility {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.ElevationOfRefHeight = null;
        /** @type {IFCLENGTHMEASURE} */
        this.ElevationOfTerrain = null;
        /** @type {IFCPOSTALADDRESS} */
        this.BuildingAddress = null;
    }
}
