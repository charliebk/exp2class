class IfcReinforcementDefinitionProperties extends IfcPreDefinedPropertySet {
    constructor() {
        /** @type {IFCLABEL} */
        this.DefinitionType = null;
        /** @type {IFCSECTIONREINFORCEMENTPROPERTIES[]} */
        this.ReinforcementSectionDefinitions = null;
    }
}
