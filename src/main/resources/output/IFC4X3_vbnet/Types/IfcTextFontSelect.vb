' SELECT TYPE IfcTextFontSelect
' Options:
' - IfcExternallyDefinedTextFont
' - IfcPreDefinedTextFont
Public Class IfcTextFontSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcExternallyDefinedTextFont OrElse TypeOf value Is IfcPreDefinedTextFont) Then
            Throw New ArgumentException("Value must be one of: IfcExternallyDefinedTextFont, IfcPreDefinedTextFont")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
