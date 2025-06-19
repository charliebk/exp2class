' SELECT TYPE IfcTrimmingSelect
' Options:
' - IfcCartesianPoint
' - IfcParameterValue
Public Class IfcTrimmingSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcCartesianPoint OrElse TypeOf value Is IfcParameterValue) Then
            Throw New ArgumentException("Value must be one of: IfcCartesianPoint, IfcParameterValue")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
