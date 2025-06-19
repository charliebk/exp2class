' SELECT TYPE IfcShell
' Options:
' - IfcClosedShell
' - IfcOpenShell
Public Class IfcShell
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcClosedShell OrElse TypeOf value Is IfcOpenShell) Then
            Throw New ArgumentException("Value must be one of: IfcClosedShell, IfcOpenShell")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
