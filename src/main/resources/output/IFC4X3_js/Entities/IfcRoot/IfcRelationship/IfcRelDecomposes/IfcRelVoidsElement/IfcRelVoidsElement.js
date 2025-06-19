class IfcRelVoidsElement extends IfcRelDecomposes {
    constructor() {
        /** @type {IFCELEMENT} */
        this.RelatingBuildingElement = null;
        /** @type {IFCFEATUREELEMENTSUBTRACTION} */
        this.RelatedOpeningElement = null;
    }
}
