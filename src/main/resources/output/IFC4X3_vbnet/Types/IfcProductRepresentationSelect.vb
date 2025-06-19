' SELECT TYPE IfcProductRepresentationSelect
' Options:
' - IfcProductDefinitionShape
' - IfcRepresentationMap
Public Class IfcProductRepresentationSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcProductDefinitionShape OrElse TypeOf value Is IfcRepresentationMap) Then
            Throw New ArgumentException("Value must be one of: IfcProductDefinitionShape, IfcRepresentationMap")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
