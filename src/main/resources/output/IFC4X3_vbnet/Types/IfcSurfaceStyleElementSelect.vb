' SELECT TYPE IfcSurfaceStyleElementSelect
' Options:
' - IfcExternallyDefinedSurfaceStyle
' - IfcSurfaceStyleLighting
' - IfcSurfaceStyleRefraction
' - IfcSurfaceStyleShading
' - IfcSurfaceStyleWithTextures
Public Class IfcSurfaceStyleElementSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcExternallyDefinedSurfaceStyle OrElse TypeOf value Is IfcSurfaceStyleLighting OrElse TypeOf value Is IfcSurfaceStyleRefraction OrElse TypeOf value Is IfcSurfaceStyleShading OrElse TypeOf value Is IfcSurfaceStyleWithTextures) Then
            Throw New ArgumentException("Value must be one of: IfcExternallyDefinedSurfaceStyle, IfcSurfaceStyleLighting, IfcSurfaceStyleRefraction, IfcSurfaceStyleShading, IfcSurfaceStyleWithTextures")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
