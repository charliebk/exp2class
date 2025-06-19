' SELECT TYPE IfcSpatialReferenceSelect
' Options:
' - IfcGroup
' - IfcProduct
Public Class IfcSpatialReferenceSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcGroup OrElse TypeOf value Is IfcProduct) Then
            Throw New ArgumentException("Value must be one of: IfcGroup, IfcProduct")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
