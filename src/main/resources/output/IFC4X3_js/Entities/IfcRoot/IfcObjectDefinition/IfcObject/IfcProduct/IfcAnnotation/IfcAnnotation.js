class IfcAnnotation extends IfcProduct {
    constructor() {
        /** @type {IFCANNOTATIONTYPEENUM} */
        this.PredefinedType = null;
    }

    // === INVERSE CLAUSES ===
    // ContainedInStructure : SET [0:1] OF IfcRelContainedInSpatialStructure FOR RelatedElements
}
