' SELECT TYPE IfcClassificationSelect
' Options:
' - IfcClassification
' - IfcClassificationReference
Public Class IfcClassificationSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcClassification OrElse TypeOf value Is IfcClassificationReference) Then
            Throw New ArgumentException("Value must be one of: IfcClassification, IfcClassificationReference")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
