class IfcRelFlowControlElements extends IfcRelConnects {
    constructor() {
        /** @type {SET [1:?] OF IFCDISTRIBUTIONCONTROLELEMENT} */
        this.RelatedControlElements = null;
        /** @type {IFCDISTRIBUTIONFLOWELEMENT} */
        this.RelatingFlowElement = null;
    }
}
