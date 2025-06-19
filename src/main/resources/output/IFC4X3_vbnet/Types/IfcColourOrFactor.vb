' SELECT TYPE IfcColourOrFactor
' Options:
' - IfcColourRgb
' - IfcNormalisedRatioMeasure
Public Class IfcColourOrFactor
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcColourRgb OrElse TypeOf value Is IfcNormalisedRatioMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcColourRgb, IfcNormalisedRatioMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
