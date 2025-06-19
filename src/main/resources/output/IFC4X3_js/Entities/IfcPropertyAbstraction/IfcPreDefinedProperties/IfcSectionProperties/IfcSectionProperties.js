class IfcSectionProperties extends IfcPreDefinedProperties {
    constructor() {
        /** @type {IFCSECTIONTYPEENUM} */
        this.SectionType = null;
        /** @type {IFCPROFILEDEF} */
        this.StartProfile = null;
        /** @type {IFCPROFILEDEF} */
        this.EndProfile = null;
    }
}
