' SELECT TYPE IfcGridPlacementDirectionSelect
' Options:
' - IfcDirection
' - IfcVirtualGridIntersection
Public Class IfcGridPlacementDirectionSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcDirection OrElse TypeOf value Is IfcVirtualGridIntersection) Then
            Throw New ArgumentException("Value must be one of: IfcDirection, IfcVirtualGridIntersection")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
