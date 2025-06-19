' SELECT TYPE IfcTimeOrRatioSelect
' Options:
' - IfcDuration
' - IfcRatioMeasure
Public Class IfcTimeOrRatioSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcDuration OrElse TypeOf value Is IfcRatioMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcDuration, IfcRatioMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
