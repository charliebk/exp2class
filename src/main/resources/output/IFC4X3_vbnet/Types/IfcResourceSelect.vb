' SELECT TYPE IfcResourceSelect
' Options:
' - IfcResource
' - IfcTypeResource
Public Class IfcResourceSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcResource OrElse TypeOf value Is IfcTypeResource) Then
            Throw New ArgumentException("Value must be one of: IfcResource, IfcTypeResource")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
