' SELECT TYPE IfcLayeredItem
' Options:
' - IfcRepresentation
' - IfcRepresentationItem
Public Class IfcLayeredItem
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcRepresentation OrElse TypeOf value Is IfcRepresentationItem) Then
            Throw New ArgumentException("Value must be one of: IfcRepresentation, IfcRepresentationItem")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
