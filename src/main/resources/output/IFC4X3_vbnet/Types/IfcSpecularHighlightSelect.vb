' SELECT TYPE IfcSpecularHighlightSelect
' Options:
' - IfcSpecularExponent
' - IfcSpecularRoughness
Public Class IfcSpecularHighlightSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcSpecularExponent OrElse TypeOf value Is IfcSpecularRoughness) Then
            Throw New ArgumentException("Value must be one of: IfcSpecularExponent, IfcSpecularRoughness")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
