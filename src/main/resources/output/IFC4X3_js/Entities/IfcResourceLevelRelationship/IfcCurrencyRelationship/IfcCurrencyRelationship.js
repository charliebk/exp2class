class IfcCurrencyRelationship extends IfcResourceLevelRelationship {
    constructor() {
        /** @type {IFCMONETARYUNIT} */
        this.RelatingMonetaryUnit = null;
        /** @type {IFCMONETARYUNIT} */
        this.RelatedMonetaryUnit = null;
        /** @type {IFCPOSITIVERATIOMEASURE} */
        this.ExchangeRate = null;
        /** @type {IFCDATETIME} */
        this.RateDateTime = null;
        /** @type {IFCLIBRARYINFORMATION} */
        this.RateSource = null;
    }
}
