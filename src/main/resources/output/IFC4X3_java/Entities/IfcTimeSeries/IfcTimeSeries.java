public class IfcTimeSeries {
    public IfcLabel Name;
    public IfcText Description;
    public IfcDateTime StartTime;
    public IfcDateTime EndTime;
    public IfcTimeSeriesDataTypeEnum TimeSeriesDataType;
    public IfcDataOriginEnum DataOrigin;
    public IfcLabel UserDefinedDataOrigin;
    public IfcUnit Unit;

    // === EXTENDED BY ===
    // IfcIrregularTimeSeries
    // IfcRegularTimeSeries

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [1:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
