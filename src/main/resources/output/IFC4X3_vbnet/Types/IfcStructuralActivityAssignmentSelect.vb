' SELECT TYPE IfcStructuralActivityAssignmentSelect
' Options:
' - IfcElement
' - IfcStructuralItem
Public Class IfcStructuralActivityAssignmentSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcElement OrElse TypeOf value Is IfcStructuralItem) Then
            Throw New ArgumentException("Value must be one of: IfcElement, IfcStructuralItem")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
