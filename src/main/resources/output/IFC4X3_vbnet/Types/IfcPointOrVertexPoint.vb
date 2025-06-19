' SELECT TYPE IfcPointOrVertexPoint
' Options:
' - IfcPoint
' - IfcVertexPoint
Public Class IfcPointOrVertexPoint
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcPoint OrElse TypeOf value Is IfcVertexPoint) Then
            Throw New ArgumentException("Value must be one of: IfcPoint, IfcVertexPoint")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
