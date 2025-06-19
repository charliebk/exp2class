' SELECT TYPE IfcProductSelect
' Options:
' - IfcProduct
' - IfcTypeProduct
Public Class IfcProductSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcProduct OrElse TypeOf value Is IfcTypeProduct) Then
            Throw New ArgumentException("Value must be one of: IfcProduct, IfcTypeProduct")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
