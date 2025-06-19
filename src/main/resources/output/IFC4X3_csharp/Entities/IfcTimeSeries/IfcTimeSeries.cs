public class IfcTimeSeries
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcDateTime StartTime { get; set; }
    public IfcDateTime EndTime { get; set; }
    public IfcTimeSeriesDataTypeEnum TimeSeriesDataType { get; set; }
    public IfcDataOriginEnum DataOrigin { get; set; }
    public IfcLabel UserDefinedDataOrigin { get; set; }
    public IfcUnit Unit { get; set; }

    // === EXTENDED BY ===
    // IfcIrregularTimeSeries
    // IfcRegularTimeSeries

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [1:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
