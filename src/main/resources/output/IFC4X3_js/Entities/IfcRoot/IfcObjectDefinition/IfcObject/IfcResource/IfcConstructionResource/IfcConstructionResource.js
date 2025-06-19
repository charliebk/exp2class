class IfcConstructionResource extends IfcResource {
    constructor() {
        /** @type {IFCRESOURCETIME} */
        this.Usage = null;
        /** @type {IFCAPPLIEDVALUE[]} */
        this.BaseCosts = null;
        /** @type {IFCPHYSICALQUANTITY} */
        this.BaseQuantity = null;
    }

    // === EXTENDED BY ===
    // IfcConstructionEquipmentResource
    // IfcConstructionMaterialResource
    // IfcConstructionProductResource
    // IfcCrewResource
    // IfcLaborResource
    // IfcSubContractResource
}
