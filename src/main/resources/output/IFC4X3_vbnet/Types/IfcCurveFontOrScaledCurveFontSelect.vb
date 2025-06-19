' SELECT TYPE IfcCurveFontOrScaledCurveFontSelect
' Options:
' - IfcCurveStyleFontAndScaling
' - IfcCurveStyleFontSelect
Public Class IfcCurveFontOrScaledCurveFontSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcCurveStyleFontAndScaling OrElse TypeOf value Is IfcCurveStyleFontSelect) Then
            Throw New ArgumentException("Value must be one of: IfcCurveStyleFontAndScaling, IfcCurveStyleFontSelect")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
