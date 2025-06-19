class IfcAppliedValue {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCAPPLIEDVALUESELECT} */
        this.AppliedValue = null;
        /** @type {IFCMEASUREWITHUNIT} */
        this.UnitBasis = null;
        /** @type {IFCDATE} */
        this.ApplicableDate = null;
        /** @type {IFCDATE} */
        this.FixedUntilDate = null;
        /** @type {IFCLABEL} */
        this.Category = null;
        /** @type {IFCLABEL} */
        this.Condition = null;
        /** @type {IFCARITHMETICOPERATORENUM} */
        this.ArithmeticOperator = null;
        /** @type {IFCAPPLIEDVALUE[]} */
        this.Components = null;
    }

    // === EXTENDED BY ===
    // IfcCostValue

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
