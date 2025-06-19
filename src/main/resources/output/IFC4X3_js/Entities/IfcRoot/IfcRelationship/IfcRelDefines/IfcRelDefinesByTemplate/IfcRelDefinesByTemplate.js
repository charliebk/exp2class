class IfcRelDefinesByTemplate extends IfcRelDefines {
    constructor() {
        /** @type {SET [1:?] OF IFCPROPERTYSETDEFINITION} */
        this.RelatedPropertySets = null;
        /** @type {IFCPROPERTYSETTEMPLATE} */
        this.RelatingTemplate = null;
    }
}
