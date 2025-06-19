class IfcTimeSeries {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCDATETIME} */
        this.StartTime = null;
        /** @type {IFCDATETIME} */
        this.EndTime = null;
        /** @type {IFCTIMESERIESDATATYPEENUM} */
        this.TimeSeriesDataType = null;
        /** @type {IFCDATAORIGINENUM} */
        this.DataOrigin = null;
        /** @type {IFCLABEL} */
        this.UserDefinedDataOrigin = null;
        /** @type {IFCUNIT} */
        this.Unit = null;
    }

    // === EXTENDED BY ===
    // IfcIrregularTimeSeries
    // IfcRegularTimeSeries

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [1:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
