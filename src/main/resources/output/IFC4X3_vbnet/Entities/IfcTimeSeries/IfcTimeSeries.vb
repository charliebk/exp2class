Public Class IfcTimeSeries
    Public Name As IfcLabel
    Public Description As IfcText
    Public StartTime As IfcDateTime
    Public EndTime As IfcDateTime
    Public TimeSeriesDataType As IfcTimeSeriesDataTypeEnum
    Public DataOrigin As IfcDataOriginEnum
    Public UserDefinedDataOrigin As IfcLabel
    Public Unit As IfcUnit

    ' === EXTENDED BY ===
    ' IfcIrregularTimeSeries
    ' IfcRegularTimeSeries

    ' === INVERSE CLAUSES ===
    ' HasExternalReference : SET [1:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
End Class
