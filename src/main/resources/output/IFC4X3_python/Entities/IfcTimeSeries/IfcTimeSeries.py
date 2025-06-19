class IfcTimeSeries:
    def __init__(self):
        self.Name: IfcLabel = None
        self.Description: IfcText = None
        self.StartTime: IfcDateTime = None
        self.EndTime: IfcDateTime = None
        self.TimeSeriesDataType: IfcTimeSeriesDataTypeEnum = None
        self.DataOrigin: IfcDataOriginEnum = None
        self.UserDefinedDataOrigin: IfcLabel = None
        self.Unit: IfcUnit = None

    # === EXTENDED BY ===
    # IfcIrregularTimeSeries
    # IfcRegularTimeSeries

    # === INVERSE CLAUSES ===
    # HasExternalReference : SET [1:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
