class IfcMappedItem extends IfcRepresentationItem {
    constructor() {
        /** @type {IFCREPRESENTATIONMAP} */
        this.MappingSource = null;
        /** @type {IFCCARTESIANTRANSFORMATIONOPERATOR} */
        this.MappingTarget = null;
    }
}
