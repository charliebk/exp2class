class IfcReference {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.TypeIdentifier = null;
        /** @type {IFCIDENTIFIER} */
        this.AttributeIdentifier = null;
        /** @type {IFCLABEL} */
        this.InstanceName = null;
        /** @type {IFCINTEGER[]} */
        this.ListPositions = null;
        /** @type {IFCREFERENCE} */
        this.InnerReference = null;
    }
}
