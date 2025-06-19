' SELECT TYPE IfcMaterialSelect
' Options:
' - IfcMaterialDefinition
' - IfcMaterialList
' - IfcMaterialUsageDefinition
Public Class IfcMaterialSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcMaterialDefinition OrElse TypeOf value Is IfcMaterialList OrElse TypeOf value Is IfcMaterialUsageDefinition) Then
            Throw New ArgumentException("Value must be one of: IfcMaterialDefinition, IfcMaterialList, IfcMaterialUsageDefinition")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
