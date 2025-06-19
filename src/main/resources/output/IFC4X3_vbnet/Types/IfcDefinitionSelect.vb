' SELECT TYPE IfcDefinitionSelect
' Options:
' - IfcObjectDefinition
' - IfcPropertyDefinition
Public Class IfcDefinitionSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcObjectDefinition OrElse TypeOf value Is IfcPropertyDefinition) Then
            Throw New ArgumentException("Value must be one of: IfcObjectDefinition, IfcPropertyDefinition")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
