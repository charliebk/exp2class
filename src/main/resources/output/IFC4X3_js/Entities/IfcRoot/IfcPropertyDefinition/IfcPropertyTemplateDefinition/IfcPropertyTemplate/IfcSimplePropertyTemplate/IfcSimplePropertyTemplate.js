class IfcSimplePropertyTemplate extends IfcPropertyTemplate {
    constructor() {
        /** @type {IFCSIMPLEPROPERTYTEMPLATETYPEENUM} */
        this.TemplateType = null;
        /** @type {IFCLABEL} */
        this.PrimaryMeasureType = null;
        /** @type {IFCLABEL} */
        this.SecondaryMeasureType = null;
        /** @type {IFCPROPERTYENUMERATION} */
        this.Enumerators = null;
        /** @type {IFCUNIT} */
        this.PrimaryUnit = null;
        /** @type {IFCUNIT} */
        this.SecondaryUnit = null;
        /** @type {IFCLABEL} */
        this.Expression = null;
        /** @type {IFCSTATEENUM} */
        this.AccessState = null;
    }
}
