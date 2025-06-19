class IfcConversionBasedUnit extends IfcNamedUnit {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCMEASUREWITHUNIT} */
        this.ConversionFactor = null;
    }

    // === EXTENDED BY ===
    // IfcConversionBasedUnitWithOffset

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
