' SELECT TYPE IfcSegmentIndexSelect
' Options:
' - IfcArcIndex
' - IfcLineIndex
Public Class IfcSegmentIndexSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcArcIndex OrElse TypeOf value Is IfcLineIndex) Then
            Throw New ArgumentException("Value must be one of: IfcArcIndex, IfcLineIndex")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
