' SELECT TYPE IfcProcessSelect
' Options:
' - IfcProcess
' - IfcTypeProcess
Public Class IfcProcessSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcProcess OrElse TypeOf value Is IfcTypeProcess) Then
            Throw New ArgumentException("Value must be one of: IfcProcess, IfcTypeProcess")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
