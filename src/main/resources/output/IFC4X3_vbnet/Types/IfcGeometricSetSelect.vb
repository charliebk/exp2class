' SELECT TYPE IfcGeometricSetSelect
' Options:
' - IfcCurve
' - IfcPoint
' - IfcSurface
Public Class IfcGeometricSetSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcCurve OrElse TypeOf value Is IfcPoint OrElse TypeOf value Is IfcSurface) Then
            Throw New ArgumentException("Value must be one of: IfcCurve, IfcPoint, IfcSurface")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
