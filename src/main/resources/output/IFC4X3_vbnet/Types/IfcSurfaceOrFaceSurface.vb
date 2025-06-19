' SELECT TYPE IfcSurfaceOrFaceSurface
' Options:
' - IfcFaceBasedSurfaceModel
' - IfcFaceSurface
' - IfcSurface
Public Class IfcSurfaceOrFaceSurface
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcFaceBasedSurfaceModel OrElse TypeOf value Is IfcFaceSurface OrElse TypeOf value Is IfcSurface) Then
            Throw New ArgumentException("Value must be one of: IfcFaceBasedSurfaceModel, IfcFaceSurface, IfcSurface")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
