' SELECT TYPE IfcCurveOrEdgeCurve
' Options:
' - IfcBoundedCurve
' - IfcEdgeCurve
Public Class IfcCurveOrEdgeCurve
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcBoundedCurve OrElse TypeOf value Is IfcEdgeCurve) Then
            Throw New ArgumentException("Value must be one of: IfcBoundedCurve, IfcEdgeCurve")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
