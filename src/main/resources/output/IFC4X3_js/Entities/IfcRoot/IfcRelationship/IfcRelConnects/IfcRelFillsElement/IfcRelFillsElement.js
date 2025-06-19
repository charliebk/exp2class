class IfcRelFillsElement extends IfcRelConnects {
    constructor() {
        /** @type {IFCOPENINGELEMENT} */
        this.RelatingOpeningElement = null;
        /** @type {IFCELEMENT} */
        this.RelatedBuildingElement = null;
    }
}
