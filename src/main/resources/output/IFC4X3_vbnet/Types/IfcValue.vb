' SELECT TYPE IfcValue
' Options:
' - IfcDerivedMeasureValue
' - IfcMeasureValue
' - IfcSimpleValue
Public Class IfcValue
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcDerivedMeasureValue OrElse TypeOf value Is IfcMeasureValue OrElse TypeOf value Is IfcSimpleValue) Then
            Throw New ArgumentException("Value must be one of: IfcDerivedMeasureValue, IfcMeasureValue, IfcSimpleValue")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
