class IfcSectionReinforcementProperties extends IfcPreDefinedProperties {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.LongitudinalStartPosition = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LongitudinalEndPosition = null;
        /** @type {IFCLENGTHMEASURE} */
        this.TransversePosition = null;
        /** @type {IFCREINFORCINGBARROLEENUM} */
        this.ReinforcementRole = null;
        /** @type {IFCSECTIONPROPERTIES} */
        this.SectionDefinition = null;
        /** @type {SET [1:?] OF IFCREINFORCEMENTBARPROPERTIES} */
        this.CrossSectionReinforcementDefinitions = null;
    }
}
