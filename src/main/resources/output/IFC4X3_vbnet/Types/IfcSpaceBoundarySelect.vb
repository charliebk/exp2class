' SELECT TYPE IfcSpaceBoundarySelect
' Options:
' - IfcExternalSpatialElement
' - IfcSpace
Public Class IfcSpaceBoundarySelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcExternalSpatialElement OrElse TypeOf value Is IfcSpace) Then
            Throw New ArgumentException("Value must be one of: IfcExternalSpatialElement, IfcSpace")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
