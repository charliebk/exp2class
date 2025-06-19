' SELECT TYPE IfcMetricValueSelect
' Options:
' - IfcAppliedValue
' - IfcMeasureWithUnit
' - IfcReference
' - IfcTable
' - IfcTimeSeries
' - IfcValue
Public Class IfcMetricValueSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcAppliedValue OrElse TypeOf value Is IfcMeasureWithUnit OrElse TypeOf value Is IfcReference OrElse TypeOf value Is IfcTable OrElse TypeOf value Is IfcTimeSeries OrElse TypeOf value Is IfcValue) Then
            Throw New ArgumentException("Value must be one of: IfcAppliedValue, IfcMeasureWithUnit, IfcReference, IfcTable, IfcTimeSeries, IfcValue")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
