' SELECT TYPE IfcPropertySetDefinitionSelect
' Options:
' - IfcPropertySetDefinition
' - IfcPropertySetDefinitionSet
Public Class IfcPropertySetDefinitionSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcPropertySetDefinition OrElse TypeOf value Is IfcPropertySetDefinitionSet) Then
            Throw New ArgumentException("Value must be one of: IfcPropertySetDefinition, IfcPropertySetDefinitionSet")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
