class IfcCostItem extends IfcControl {
    constructor() {
        /** @type {IFCCOSTITEMTYPEENUM} */
        this.PredefinedType = null;
        /** @type {IFCCOSTVALUE[]} */
        this.CostValues = null;
        /** @type {IFCPHYSICALQUANTITY[]} */
        this.CostQuantities = null;
    }
}
