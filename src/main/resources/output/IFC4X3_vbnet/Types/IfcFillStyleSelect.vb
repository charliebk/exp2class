' SELECT TYPE IfcFillStyleSelect
' Options:
' - IfcColour
' - IfcExternallyDefinedHatchStyle
' - IfcFillAreaStyleHatching
' - IfcFillAreaStyleTiles
Public Class IfcFillStyleSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcColour OrElse TypeOf value Is IfcExternallyDefinedHatchStyle OrElse TypeOf value Is IfcFillAreaStyleHatching OrElse TypeOf value Is IfcFillAreaStyleTiles) Then
            Throw New ArgumentException("Value must be one of: IfcColour, IfcExternallyDefinedHatchStyle, IfcFillAreaStyleHatching, IfcFillAreaStyleTiles")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
