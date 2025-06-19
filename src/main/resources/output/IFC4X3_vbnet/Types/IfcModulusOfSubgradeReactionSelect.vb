' SELECT TYPE IfcModulusOfSubgradeReactionSelect
' Options:
' - IfcBoolean
' - IfcModulusOfSubgradeReactionMeasure
Public Class IfcModulusOfSubgradeReactionSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcBoolean OrElse TypeOf value Is IfcModulusOfSubgradeReactionMeasure) Then
            Throw New ArgumentException("Value must be one of: IfcBoolean, IfcModulusOfSubgradeReactionMeasure")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
