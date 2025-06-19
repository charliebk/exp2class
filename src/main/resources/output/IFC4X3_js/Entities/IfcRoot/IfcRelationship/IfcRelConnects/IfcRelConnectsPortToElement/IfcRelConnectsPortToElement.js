class IfcRelConnectsPortToElement extends IfcRelConnects {
    constructor() {
        /** @type {IFCPORT} */
        this.RelatingPort = null;
        /** @type {IFCDISTRIBUTIONELEMENT} */
        this.RelatedElement = null;
    }
}
