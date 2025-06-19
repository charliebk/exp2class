' SELECT TYPE IfcCurveOnSurface
' Options:
' - IfcCompositeCurveOnSurface
' - IfcPcurve
' - IfcSurfaceCurve
Public Class IfcCurveOnSurface
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcCompositeCurveOnSurface OrElse TypeOf value Is IfcPcurve OrElse TypeOf value Is IfcSurfaceCurve) Then
            Throw New ArgumentException("Value must be one of: IfcCompositeCurveOnSurface, IfcPcurve, IfcSurfaceCurve")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
