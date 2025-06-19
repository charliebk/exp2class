' SELECT TYPE IfcCurveStyleFontSelect
' Options:
' - IfcCurveStyleFont
' - IfcPreDefinedCurveFont
Public Class IfcCurveStyleFontSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcCurveStyleFont OrElse TypeOf value Is IfcPreDefinedCurveFont) Then
            Throw New ArgumentException("Value must be one of: IfcCurveStyleFont, IfcPreDefinedCurveFont")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
