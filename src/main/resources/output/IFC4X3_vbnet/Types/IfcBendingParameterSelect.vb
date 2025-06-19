' SELECT TYPE IfcBendingParameterSelect
' Options:
' - IfcLengthMeasure
' - IfcPlaneAngleMeasure
Public Class IfcBendingParameterSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcLengthMeasure OrElse TypeOf value Is IfcPlaneAngleMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcLengthMeasure, IfcPlaneAngleMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
